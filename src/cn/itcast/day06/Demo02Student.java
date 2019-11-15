package cn.itcast.day06;
/*
通常情况下，一个类并不能直接使用，需要根据类创建一个对象，才能使用。
1.导包
2.创建，格式：
类名称 对象名 = new 类名称（）
Student stu = new Student();

3.使用，分为两种情况：
使用成员变量；对象名.成员变量名
使用成员方法：对象名.成员方法名（参数）；
（也就是，想用谁 就用对象名点谁）


注意事项：
如果成员变量没有赋值，那么将会有一个默认值，规则跟数组相同。
 */
public class Demo02Student {
    public static void main(String[] args) {
        Student stu = new Student();
        System.out.println(stu.age);
        System.out.println(stu.name);
        System.out.println("=========================");


        //改变对象中成员变量数值内容
        //将右侧的字符串，赋值交给stu对象当中的name成员变量

        stu.name = "高仁旭";
        stu.age = 22;
        System.out.println(stu.age);
        System.out.println(stu.name);
        System.out.println("=========================");



        //使用对象的成员方法，格式：
        //对象名.成员方法名（参数）
        stu.eat();
        stu.sleep();
        stu.study();
    }

}
