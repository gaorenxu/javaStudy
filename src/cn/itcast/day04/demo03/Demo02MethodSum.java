package cn.itcast.day04.demo03;
/*
题目要求：
定义一个方法，用来求出1-100之间所有数字的和值
 */
public class Demo02MethodSum {
    public static void main(String[] args) {
        System.out.println("数值累计的和为："+getSum());
    }
    /*
    三要素：
    返回值：有返回值，计算结果是一个int 数字
    方法名称：getSum
    参数列表：数据范围已经确定，是固定的，所以不需要告诉我任何条件，不需要参数
     */
     public  static  int getSum(){
         int sum = 0;
         for (int i = 0; i <= 100; i++) {
              sum += i;
         }
         return  sum;
     }
}
