package com.lanniuh.java;

import java.util.Scanner;

/**
 * Created by linjian
 * 16/9/25.
 */
public class Test {
    public static void main(String[] args) {
        System.out.println("和林剑一起去旅行：y/n");
        Scanner scanner = new Scanner(System.in);
        String answer = scanner.nextLine();
        while (!answer.equals("y")) {
            System.out.println("和林剑一起去旅行：y/n");
            answer = scanner.nextLine();
        }
        System.out.println("出发吧！");
    }
}
