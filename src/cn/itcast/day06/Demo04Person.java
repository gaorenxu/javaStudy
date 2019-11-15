package cn.itcast.day06;

public class Demo04Person {
    public static void main(String[] args) {
        Person person = new Person();
//        person.age = 22;直接访问private，错误写法
        person.name = "高仁旭";
        person.setAge(22);
        person.show();
    }
}
