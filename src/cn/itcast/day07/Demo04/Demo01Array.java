package cn.itcast.day07.Demo04;
/*
题目：
定义一个数组，用来存储三个Person对象；

数组有一个缺点 ：在程序运行期间其长度不可以发生变化
 */
public class Demo01Array {
    public static void main(String[] args) {
        Person[] array = new Person[3];
        Person one = new Person("高仁旭",18);
        Person two = new Person("牛凯",60);
        Person three = new Person("王浩",80);

        array[0] = one;
        array[1] = two;
        array[2] = three;

        System.out.println("姓名是："+array[0].getName()+",年龄是："+array[0].getAge());
        System.out.println("姓名是："+array[1].getName()+",年龄是："+array[1].getAge());
        System.out.println("姓名是："+array[2].getName()+",年龄是："+array[2].getAge());
    }
}
