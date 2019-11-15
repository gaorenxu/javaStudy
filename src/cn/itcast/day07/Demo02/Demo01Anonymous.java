package cn.itcast.day07.Demo02;

/*
匿名对象就是只有右边的对象，没有左边的名字和赋值运算符
new 类名称（）；

注意事项： 匿名对象方法只能使用唯一的一次，下次再用不得不创建一个新的对象。
使用建议：如果确定有一个对象只需要使用唯一的一次，就可以使用匿名对象
 */

public class Demo01Anonymous {
    public static void main(String[] args) {
        Person person = new Person();

        person.setName("高仁旭");
        person.showName();
        System.out.println("=====================");

        new Person().setName("dsdas");
    }
}
