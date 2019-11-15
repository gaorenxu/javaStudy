package cn.itcast.day04.Demo04;
/*
题目要求：
定义一个方法，比较两个数据是否相等。
参数类型分别为两个byte类型，两个int类型，两个long类型，并在main方法中进行测试
 */
public class Demo02MethodOverloadSame {
    public static void main(String[] args) {
       byte a = 10;
       byte b = 20;
        System.out.println(isName(a,b));
        System.out.println(isName((short)20,(short)20));
        System.out.println(isName(11,21));
        System.out.println(isName(10L,10L));
    }

    public  static  boolean  isName(byte a , byte b){
        System.out.println("两个byte类型的值进行比较：是否一样？");
        boolean same;
        if ( a == b){
            same = true;
        }else {
            same = false;
        }
        return same;
    }


    public  static  boolean isName(int a, int b){
        System.out.println("两个int类型的值进行比较：是否一样？");
        boolean same = a == b? true:false;
        return  same;
    }

    public  static  boolean isName(short a,short b){
        System.out.println("两个short类型的值进行比较：是否一样？");
        return  a == b ;
    }

    public  static boolean isName(long a,long b){
        System.out.println("两个long类型的值进行比较：是否一样？");
        if ( a ==b){
            return true;
        }else {
            return false;
        }
    }
}
