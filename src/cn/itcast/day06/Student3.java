package cn.itcast.day06;
/*
一个标准的类通常要满足以下四个部分：
1.所有的成员变量都要使用private关键字进行私有化修饰；
2.为每一个成员变量编写一对Setter/Getter方法
3.编写一个无参数的构造方法
4.编写一个全参数的构造方法

这样标准的类也叫作java bean
 */
public class Student3 {
    private  String name;
    private  int age ;
    private  boolean meal;

    public Student3() {
    }

    public Student3(String name, int age, boolean meal) {
        this.name = name;
        this.age = age;
        this.meal = meal;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean isMeal() {
        return meal;
    }

    public void setMeal(boolean meal) {
        this.meal = meal;
    }
}
