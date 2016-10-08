package com.lanniuh;

import org.junit.Test;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.channels.SelectionKey;
import java.nio.channels.Selector;
import java.nio.channels.SocketChannel;
import java.util.Iterator;
import java.util.Set;

/**
 * Created by linjian on 16/8/3.
 */
public class NIOTest {
    @Test
    public void readFromFile() {
        try {
            RandomAccessFile file = new RandomAccessFile(NIOTest.class.getClassLoader().getResource("nio-data.txt").getFile(), "rw");
            FileChannel channel = file.getChannel();

            readFromChannel(channel);

            file.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Test
    public void transferFromTest() {
        try {
            RandomAccessFile fromFile = new RandomAccessFile(NIOTest.class.getClassLoader().getResource("fromFile.txt").getFile(), "rw");
            FileChannel fromChannel = fromFile.getChannel();
            RandomAccessFile toFile = new RandomAccessFile(NIOTest.class.getClassLoader().getResource("toFile.txt").getFile(), "rw");
            FileChannel toChannel = toFile.getChannel();

            long position = 0;
            long count = fromChannel.size();
            System.out.println(count);

            toChannel.transferFrom(fromChannel, position, count);

            readFromChannel(toChannel);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void transferToTest() throws FileNotFoundException {
        RandomAccessFile fromFile = new RandomAccessFile(NIOTest.class.getClassLoader().getResource("fromFile.txt").getFile(), "rwd");
        FileChannel fromChannel = fromFile.getChannel();
        RandomAccessFile toFile = new RandomAccessFile("toFile.txt", "rwd");
        FileChannel toChannel = toFile.getChannel();
        try {
            long position = 0;
            long count = fromChannel.size();

            long res = fromChannel.transferTo(position, count, toChannel);
            System.out.println("transfer data size " + res);

            readFromChannel(toChannel);
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                fromChannel.close();
                toChannel.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    @Test
    public void selectorTest() throws IOException {
        SocketChannel channel = SocketChannel.open();

        channel.configureBlocking(false);
        Selector selector = Selector.open();
        SelectionKey key = channel.register(selector, SelectionKey.OP_READ);
        while (true) {
            int readyChannels = selector.select();
            if (readyChannels == 0) continue;
            Set selectedKeys = selector.selectedKeys();
            Iterator keyIterator = selectedKeys.iterator();
            while (keyIterator.hasNext()) {
//                key = (SelectionKey) keyIterator.next();
                if (key.isAcceptable()) {
                    // a connection was accepted by a ServerSocketChannel.
                    System.out.println("acceptable");
                } else if (key.isConnectable()) {
                    // a connection was established with a remote server.
                    System.out.println("connectable");
                } else if (key.isReadable()) {
                    // a channel is ready for reading
                    System.out.println("readable");
                } else if (key.isWritable()) {
                    // a channel is ready for writing
                    System.out.println("writable");
                }
                keyIterator.remove();
            }
        }

    }

    @Test
    public void fileChannelWriteTest() {
        RandomAccessFile file;
        FileChannel channel = null;
        try {
            file = new RandomAccessFile("fileChannelTest.txt", "rw");
            channel = file.getChannel();
            String newData = "New String to write to file..." + System.currentTimeMillis();

            ByteBuffer buf = ByteBuffer.allocate(48);
            buf.clear();

            buf.put(newData.getBytes());
            System.out.println("input length:" + newData.getBytes().length);

            buf.flip();

            while (buf.hasRemaining()) {
                channel.write(buf);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                channel.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }


    private static void readFromChannel(FileChannel channel) {
        try {
            ByteBuffer buffer = ByteBuffer.allocate(48);
            int bytesRead = channel.read(buffer);//read into buffer.

            while (bytesRead != -1) {
                System.out.println("Read " + bytesRead);
                buffer.flip();  //make buffer ready for read

                while (buffer.hasRemaining()) {
                    System.out.println((char) buffer.get());// read 1 byte at a time
                }
                buffer.clear();//make buffer ready for writing
                bytesRead = channel.read(buffer);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
