package cn.itcast.day04.Demo04;
/*
对于功能类似的方法，只因为参数列表不同，却需要记住那么多的方法名称，太麻烦，

方法的重载（OverLoad）：多个方法的名称一样，但是参数列表不同，好处：只需要记住唯一一个方法名称，就可以实现多个类似的功能
方法的重载与下列因素有关：
1.参数的个数不同。
2.参数的类型不同，
3.参数的多类型顺序不同
方法的重载与下列因素无关：
1.与参数的名称无关
2.与方法的返回值类型无关
 */
public class Demo01MethodOverload {
    public static void main(String[] args) {
        System.out.println(sum(10,20,30));
    }
    public  static  int sum(int a,int b){
        return  a + b;
    }
    public  static  int sum(int a,int b,int c){
        return  a + b + c;
    }
    public  static  int sum(int a,int b,int c,int d){
        return  a + b + c + d;
    }

}
