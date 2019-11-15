package cn.itcast.day07.Demo01;

import java.util.Scanner;//1.导包

/*
Scanner类的功能：可以实现键盘输入数据到程序中。

引用类型的一般使用步骤：
1.导包
import 包路径.类名称;
如果需要使用的目标类和当前类位于同一个包下，则可以省略包语句不写
只有java.lang包下不需要导包语句


2.创建
类名称 对象名 =  new 类名称（参数类型，参数名称）；


3.使用
对象名.成员方法名（）；
 */
public class Demo01Scanner {
    public static void main(String[] args) {
        //2.创建  System.in 从键盘输入
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int sum = num1+ num2;
        System.out.println("两个数字的和为"+sum);
//        String str = sc.next();
//        System.out.println("输入的数字是：" + num);
//        System.out.println("输入的字符串是：" + str);
    }
}
