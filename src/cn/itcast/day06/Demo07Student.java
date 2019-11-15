package cn.itcast.day06;

public class Demo07Student {
    public static void main(String[] args) {
        Student2 stu1 = new Student2();
        System.out.println("======================");
        Student2 stu2 = new Student2("高仁旭", 18);
        System.out.println("姓名：" + stu2.getName());
        System.out.println("年龄：" + stu2.getAge());
        System.out.println("======================");
        stu2.setName("旭哥");
        stu2.setAge(22);
        System.out.println("姓名：" + stu2.getName());
        System.out.println("年龄：" + stu2.getAge());
    }
}
