package cn.itcast.day06;

/*
当方法的局部变量与参数重名时，优先使用就近原则。使用局部变量，
如果需要访问本类中的成员变量，使用关键字this
使用格式：this.成员变量名
 */
public class Peron1 {
    String name;


    public void sayHello(String name) {
        System.out.println(name + "你好，我是" + this.name);
    }
}

