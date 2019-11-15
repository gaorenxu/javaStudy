package cn.itcast.day07.Demo05;

import java.util.ArrayList;
import java.util.Random;

/*
题目要求：生成6个1-33之间的随机数，添加到集合，并遍历集合
 */
public class Demo01ArrayListRandom {
    public static void main(String[] args) {
        Random random = new Random();
        int num1 = random.nextInt(33) + 1;
        int num2 = random.nextInt(33) + 1;
        int num3 = random.nextInt(33) + 1;
        int num4 = random.nextInt(33) + 1;
        int num5 = random.nextInt(33) + 1;
        int num6 = random.nextInt(33) + 1;

        ArrayList <Integer> list = new ArrayList<>();

        list.add(num1);
        list.add(num2);
        list.add(num3);
        list.add(num4);
        list.add(num5);
        list.add(num6);

        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }
}
