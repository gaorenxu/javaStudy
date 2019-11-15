package cn.itcast.day04.demo03;
/*
题目要求：
定义一个方法：打印指定次数的helloworld
 */
public class Demo03MethodPrint {
    public static void main(String[] args) {
       printCount(10);
    }
    /*
    三要素：
    返回值类型：只是进行一大堆打印操作，没有计算，没有结果返回告诉调用处
    方法名称：printCount
    参数列表：到底要打印多少次？必须告诉我，否则我不知道要打印多少次，没法打印。打印次数：int
     */
    public static void printCount(int number){
        for (int i = 0; i < number; i++) {
            System.out.println("Hello,world!"+ (i + 1 ));
        }
    }
}
