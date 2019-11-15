package cn.itcast.day07.Demo04;
/*
如果希望向ArrayList集合中存储基本数据类型，必须使用基本类型器对应的包装类。
   基本类型         包装类（应用类型，都在java.lang包）
   byte            Byte
   short           Short
   int             Integer           [特殊]
   long            Long
   float           Float
   double          Double
   char            Character         [特殊]
   boolean         Boolean

从JDK1.5+开始，支持自动装箱，自动拆箱。
自动装箱：基本类型 --> 引用类型
自动拆箱：引用类型 --> 基本类型
 */

import java.util.ArrayList;

public class Demo05ArrayListBasic {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(100);
        list.add(200);
        list.add(300);
        list.add(400);
        list.add(500);
        System.out.println(list);
        int num = list.get(4);
        System.out.println("第4号元素是" + num);

    }
}
