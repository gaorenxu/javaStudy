package cn.itcast.day05;
/*
动态初始化（指定长度）：在创建数组的时候，直接指定数组当中元素的个数
静态初始化（指定内容）：在创建数组的时候，不直接指定数据的个数多少，而是直接将具体的数据内容进行指定

静态初始化的基本格式：
数据类型 [] 数组名称 = new 数据类型[] {元素1，元素2 ....}；

注意事项：
虽然静态初始化没有直接告诉长度，但是根据大括号里面给的具体数据内容也可以推算出长度。
 */
public class Demo02Array {
    public static void main(String[] args) {
        //直接创建一个数组，里面装的全是int数字，具体为：5,15,25
        int [] arrayA = new int[]{5,15,25};
        //直接创建一个数组，里面装的全是字符串，具体为：“Hello”，“World”，“Java”
        String [] arrayB = new String[]{"Hello","World","Java"};
    }
}
