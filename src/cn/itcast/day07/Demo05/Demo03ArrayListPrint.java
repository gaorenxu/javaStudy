package cn.itcast.day07.Demo05;

import java.util.ArrayList;

public class Demo03ArrayListPrint {
    public static void main(String[] args) {
        ArrayList <String> list = new ArrayList<>();
        list.add("高仁旭");
        list.add("油菜");
        list.add("王浩");
        list.add("张博");
        System.out.println(list);
        System.out.println("===============");

        printArray(list);
    }


    public static  void printArray(ArrayList <String> list){
        System.out.print("{");
        for (int i = 0; i < list.size(); i++) {
            String name = list.get(i);
            if (i == list.size() - 1){
                System.out.print(name + "}");
            }else{


            System.out.print(name + "@");
            }
        }

    }
}
