package cn.itcast.day07.Demo04;

import java.sql.SQLOutput;
import java.util.ArrayList;

/*
  ArrayList当中的常用方法有：
  public boolean add (E e):向集合中添加元素，参数的类型和泛型一致   返回值代表添加是否成功
  备注：
  对于ArrayList集合，add添加动作是一定成功的，所以返回值可用可不用
  但是对于其他集合（今后学习），add添加动作不一定成功，
  public E get(int index):从集合当中获取元素，参数是索引编号，返回值就是对应位置的元素
  public E remove(int index):从集合中适当删除元素，参数是索引编号，返回值就是被删除掉的元素。
  public int size ():获取集合的尺寸长度，返回值就是集合中包含的元素个数。

*/
public class Demo03ArrayListMethod {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();

        //向集合中添加元素：add
        boolean success = list.add("高仁旭");
        System.out.println(list);
        System.out.println("添加是否成功？" + success);
        list.add("王浩");
        list.add("油菜");
        list.add("张博");
        list.add("牛凯");
        list.add("邵文浩");
        System.out.println(list);
        System.out.println("================");

        //从集合中获取元素：get  索引值从0开始
        String name1 = list.get(1);
        System.out.println("个子最高的是：" + name1);
        System.out.println("================");
        //从集合中删除元素：remove 索引值从0开始

        String whoremoved = list.remove(5);
        System.out.println("被删除的人是:" + whoremoved);
        System.out.println("删除后的内容为：" + list);
        System.out.println("================");

        //获取集合的长度：int size（）；
        int size = list.size();
        System.out.println("现在集合的长度为：" + size);
    }

}
