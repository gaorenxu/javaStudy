package cn.itcast.day06;

public class Phone {
    String brand;
    int price;
    String color;


    public  void call(String who){
        System.out.println("我正在给"+who+"打电话");

    }
    public  void  sendmessage(){
        System.out.println("群发短信");
    }
}
