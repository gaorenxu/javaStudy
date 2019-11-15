package cn.itcast.day06;

public class Demo05Student {
    public static void main(String[] args) {
        Student1 stu = new Student1();
        stu.setName("高仁旭");
        stu.setAge(22);
        stu.setMale(true);

        System.out.println("姓名:" + stu.getName());
        System.out.println("年龄:" + stu.getAge());
        System.out.println("是不是男的:" + stu.isMale());
    }



}
