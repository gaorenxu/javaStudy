package cn.itcast.day07.Demo04;

import java.util.ArrayList;

public class Demo04ArrayListEach {
    public static void main(String[] args) {
        ArrayList<String > list = new ArrayList<>();
        list.add("王浩");
        list.add("油菜");
        list.add("张博");
        list.add("牛凯");
        list.add("邵文浩");
        list.add("高仁旭");

        //遍历集合
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }
}
