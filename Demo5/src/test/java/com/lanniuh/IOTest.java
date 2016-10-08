package com.lanniuh;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Scanner;

/**
 * Created by linjian on 16/8/4.
 */
public class IOTest {
    /**
     * 获取控制台输入
     * @throws IOException
     */
    public void inReadTest() throws IOException {
        InputStream inputStream = System.in;
        InputStreamReader inputStreamReader = new InputStreamReader(inputStream);
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
        System.out.println(bufferedReader.readLine());
    }


    /**
     * 获取控制台输入Scanner
     */
    public void scannerTest() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("输入第一个boolean值(true/false):");
        if (scanner.nextBoolean()) {
            System.out.println("输入布尔：真的");
        } else {
            System.out.println("输入布尔：假的");
        }

        System.out.println("输入第一个数字:");
        System.out.println("输入数字：" + scanner.nextInt());

        System.out.println("输入一个字符串:");
        System.out.println("输入字符串：" + scanner.next());

        System.out.println("输入一个长整型:");
        System.out.println("输入长整型：" + scanner.nextLong());
    }


}
