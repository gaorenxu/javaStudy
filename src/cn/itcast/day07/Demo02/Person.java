package cn.itcast.day07.Demo02;

public class Person {
     private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Person(String name) {

        this.name = name;
    }

    public Person() {

    }
    public  void showName(){
        System.out.println("我的名字是："+ name);
    }
}
