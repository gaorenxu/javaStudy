package cn.itcast.day07.Demo04;

import java.util.ArrayList;

/*
数组的长度不可以发生改变
但是ArrayList集合的长度是可以发生改变的

对于ArrayList来说，有一个尖括号<E>代表泛型；
泛型概念：就是装在集合中的元素，全部都是什么类型（同一类型）。
注意：泛型只能是引用类型，不能是基本类型。
扩展:对于ArrayList集合，直接打印得到的不是地址值，而是内容
如果内容为空，则得到的是一对空的中括号[]
 */
public class Demo02ArrayList {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("高仁旭");
        list.add("王浩");
        list.add("油菜");
        list.add("张博");

        System.out.println(list);
    }
}
