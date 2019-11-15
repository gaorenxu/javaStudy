package cn.itcast.day06;

/*
构造方法是专门用来创建对象的方法，当我们通过关键字new来创建对象时，其实就是在调用构造方法。
格式：
public 类名称 （参数类型 参数名称）{
     方法体
}
注意事项：
1.构造方法的名称 和类名称 一定要一模一样，就连大小写也要一样；
2.构造方法不写返回值类型，就连void也不写
3.构造方法不能return一个具体的返回值
4.如果没有编写任何构造方法，那么编译器会默认赠送一个构造方法，没有参数，方法并且什么事情都不做
public Student(){}
5.一旦编写了至少一个构造方法，那么编译器将不再赠送编译方法
6.构造方法也是可以进行重载的
重载：方法名称相同，方法名称不同
 */
public class Student2 {
    private  String name;
    private  int age;



    public Student2(){
        System.out.println("无参方法执行啦");

    }
    public  Student2(String name , int age){
        this.name = name;
        this.age = age;
        System.out.println("全参方法执行啦");

    }

    public void setAge(int age) {
        this.age = age;
    }
    public int getAge() {
        return age;
    }



    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }


}
