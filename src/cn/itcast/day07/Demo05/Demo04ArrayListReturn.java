package cn.itcast.day07.Demo05;
/*
题目：
用一个大集合，随机存放10个数字，然后筛选其中的元素，放到小集合当中去，
要求使用自定义的方法来实现
 */

import java.util.ArrayList;
import java.util.Random;

public class Demo04ArrayListReturn {
    public static void main(String[] args) {
        ArrayList<Integer> list1 = new ArrayList<>();
        Random random = new Random();
        for (int i = 0; i < 20; i++) {
            int num = random.nextInt(20) + 1;
            list1.add(num);
        }
        System.out.println(list1);
        System.out.println("====================");

        ArrayList<Integer> list2 = shaixuan(list1);
        System.out.println("偶数一共有" + list2.size() + "个,他们分别是：");
        for (int i = 0; i < list2.size(); i++) {
            int num2 = list2.get(i);
            if (i == list2.size() - 1) {
                System.out.println(num2);
            }
            System.out.print(num2 + ",");

        }


    }

    public static ArrayList<Integer> shaixuan(ArrayList<Integer> list1) {
        ArrayList<Integer> list2 = new ArrayList<>();

        for (int i = 0; i < list1.size(); i++) {
            int num = list1.get(i);
            if (num % 2 == 0) {
                list2.add(num);
            }
        }
        return list2;
    }


}
