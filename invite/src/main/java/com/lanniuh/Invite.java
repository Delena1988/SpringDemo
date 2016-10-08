package com.lanniuh;

import java.util.Scanner;

/**
 * Created by linjian
 * 16/9/25.
 */
public class Invite {
    public static void main(String[] args) {
        int i = 1;
        System.out.println("林剑向你发起第 " + i + " 次邀请，一起去旅行吧：y/n");
        Scanner scanner = new Scanner(System.in);
        String answer = scanner.nextLine();
        while (!answer.equals("y")) {
            System.out.println("你已经拒绝了林剑的" + i + "次邀请");
            System.out.println("林剑向你发起第 " + ++i + " 次邀请，一起去旅行吧：y/n");
            answer = scanner.nextLine();
        }
        System.out.println("出发吧！");
    }
}
