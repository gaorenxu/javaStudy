package cn.itcast.day04.demo02;

/*
方法其实是若干语句的功能集合。
参数（原料 ）：就是进入方法的数据
返回值（产出物）：就是从方法中出来的数据。
定义方法的完整格式：
修饰符 返回值类型 方法名称（参数类型 参数名称，...）{
       方法体
       return 返回值类型；
}
修饰符：现阶段 public static
返回值类型：也就是方法最终产生的数据结果是什么类型
方法名称：方法的名字，规则和变量一样，小驼峰
参数类型：进入方法的数据是什么类型
参数名称：进入方法的数据对应的名称
ps：参数如果有多个，使用逗号进行分隔
方法体：方法做的事情，若干行代码
return：两个作用，第一个是停止当前的方法。第二是将后面的结果数据返回值还给调用处
返回值：也就是方法执行后最终产生的数据结果
注意；return后面的返回值，必须和方法名称前面的返回值类型保持对应

定义一个两个int数字相加的方法，三要素：
返回值类型 ： int
方法名称：sum
参数列表：int a ,int b


方法三种调用格式：
1.单独调用：方法名称（参数）；
2.打印调用：System.out.println(方法名称（参数）);
3.赋值调用：数据类型 变量名称 = 方法名称（参数）；
*/
public class Demo02MethodDefine {
    public static void main(String[] args) {
        //单独调用
        sum(10, 20);
        //打印调用
        System.out.println(sum(10, 20));//30
        //赋值调用
        int number = sum(10, 20);
        System.out.println("变量的值：" + number);
    }

    public static int sum(int a, int b) {
        int result = a + b;


        return result;
    }
}
