package cn.itcast.day06;
/*
问题描述：我在定义一个Person的年龄时，无法阻止不合理的数值被设置进来。
解决方案：用private关键字将需要保护的成员变量进行修饰。
一旦使用了private 进行修饰，本类仍然可以直接访问。
但是！  一旦超出了本类的范文，就不能进行直接访问了。

间接访问private成员变量，就是定义getter/setter方法
 */
public class Person {
    String name;
    private  int age;


    public void show(){
        System.out.println("我叫"+name +",今年已经"+age +"岁了");
    }

    //这个成员方法专门用于设置age的数据
    public void setAge(int num) {
        if(num >= 0 && num < 100){
            //如果情况合理
            age = num;
        }else{
            System.out.println("数据不合理");
        }

    }
    //这个成员方法专门用于获取age的数据
    public  int getAge(){
        return  age;
    }
}
