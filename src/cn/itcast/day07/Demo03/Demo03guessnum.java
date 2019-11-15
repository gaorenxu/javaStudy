package cn.itcast.day07.Demo03;

import java.util.Random;
import java.util.Scanner;

/*
猜数字游戏：
猜数字小游戏：随机生成一个随机数，范围1-20之间，猜大了告诉你猜大了，猜小了告诉你猜小了
 */
public class Demo03guessnum {
    public static void main(String[] args) {
        Random r = new Random();
        int num = r.nextInt(20) + 1;
//        System.out.println(num);

        Scanner sc = inPut();
        int guessnum = sc.nextInt();
        while(guessnum != num){
            if (guessnum > num) {
                System.out.println("猜大了");
                System.out.println("请再次输入猜的数字：");


            }
            if (guessnum < num) {
                System.out.println("猜小了");
                System.out.println("请再次输入猜的数字：");
            }

            guessnum = sc.nextInt();
        }

        if (guessnum == num){
            System.out.println("恭喜你，猜中啦！你真是个天才");
        }

    }

    public static Scanner inPut() {

        System.out.println("请输入猜的数字:");


        return new Scanner(System.in);
    }
}
