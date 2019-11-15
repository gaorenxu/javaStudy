package cn.itcast.day07.Demo03;

import java.util.Random;
import java.util.Scanner;

/*
题目要求：
根据int变量的值，来获取随机数字[1,n]
 */
public class Demo02Random {
    public static void main(String[] args) {
        Scanner sc = inPut();

        int n = sc.nextInt();

        Random r = new Random();
        for (int i = 0; i < 100; i++) {
           int result = r.nextInt(n) + 1;
            System.out.println(result);
        }
    }
    public static Scanner inPut(){

        System.out.println("请输入n的值:");


        return new Scanner(System.in);
    }
}
