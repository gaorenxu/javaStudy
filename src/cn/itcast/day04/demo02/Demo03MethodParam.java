package cn.itcast.day04.demo02;

/*
有参数：小括号当中有内容，当一个方法需要一些数据条件才能完成任务的时候，就是有参数。
例如两个数字相加，必须知道两个数字是多少才能相加。
无参数：小括号留空。一个方法不需要任何数据条件，自己独立就能完成，就是无参数。
例如：例如定义一个方法，打印10次HelloWorld。
*/
public class Demo03MethodParam {
    public static void main(String[] args) {
        method1(10,20);
        System.out.println("_____________");
        method2();
    }
    //两个数字相乘，必须知道两个数字各自是多少 ，不然无法完成。
    public static void method1(int a, int b){
        int result = a * b;
        System.out.println("结果是:" +result);
    }
    //打印输出固定十次的字符串
    public static  void method2(){
        for (int i = 0; i < 10; i++) {
            System.out.println("helloworld"+i);
        }
    }
}
