package cn.itcast.day04.demo02;

/*复习一下此前学习的方法基础入门知识
    定义格式：
    public static void 方法名称（）{
     方法体
    }

    调用格式：
    方法名称（）；
    注意事项：
    1.方法定义的先后顺序无所谓
    2.方法的定义必须是挨着的，不能再一个方法的内部定义另外一个方法
    3.方法定义之后，自己不会执行，如果希望执行，则要进行方法的调用

 */
public class Demo01Method {
    public static void main(String[] args) {
        printMethod();
    }

    public static void printMethod() {
        for (int j = 0; j < 5; j++) {
            for (int i = 0; i <= 20; i++) {
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}
