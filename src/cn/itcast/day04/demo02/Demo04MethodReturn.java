package cn.itcast.day04.demo02;

/*
题目要求：定义一个方法 求出两个数字之和（你帮我算，算完之后把结果告诉我）
题目变形：定义一个方法 打印两个数字之和（你来计算，算完之后你自己负责显示结果，不用告诉我结果）
注意事项：对于有返回值的方法，可以使用单独调用，打印调用，赋值调用
        对于没有返回值的方法，只能使用单独调用。
*/
public class Demo04MethodReturn {
    public static void main(String[] args) {
        //我是main方法，我来调用你
        //我调用你，你来帮我计算一下，算完了之后，把结果告诉我的mnumber变量
        int number = getSum(10, 20);
        System.out.println("计算结果是:" + number);
        System.out.println("_____________________");
        printSum(20, 30);
    }

    //我是一个方法，我负责把两个数字相加
    //我有返回值int，谁调用我，我就把计算结果告诉谁
    public static int getSum(int a, int b) {
        int result = a + b;
        return result;
    }

    //我是一个方法，我负责两数相加
    //我没有返回值，我不会把结果告诉任何人，只会自己打印输出
    public static void printSum(int a, int b) {
        int result = a + b;
        System.out.println("结果是" + result);

    }
}
