package cn.itcast.day07.Demo05;
/*
自定义四个学生对象，并添加到集合，遍历
 */

import java.util.ArrayList;

public class Demo02ArrayListStudent {
    public static void main(String[] args) {
        ArrayList<Student> list = new ArrayList<>();
        Student stu1 = new Student("高仁旭",18);
        Student stu2 = new Student("王浩",18);
        Student stu3 = new Student("油菜",18);
        Student stu4 = new Student("张博",18);

        list.add( stu1 );
        list.add( stu2 );
        list.add( stu3 );
        list.add( stu4 );

        for (int i = 0; i < list.size(); i++) {
            Student s = list.get(i);
            System.out.println("年龄是："+s.getAge() + "姓名是：" + s.getName());
        }

    }
}
