package cn.itcast.day06;

public class Demo01Phoneone {
    public static void main(String[] args) {
        Phone one = new Phone();
        one.brand="小米";
        one.color = "土豪金";
        one.price = 10000;
        System.out.println("我使用的手机品牌是"+one.brand);
        System.out.println("我使用的手机颜色是"+one.color);
        System.out.println("我使用的手机价格是"+one.price);

        one.call("王亚婧");
        one.sendmessage();
    }
}
