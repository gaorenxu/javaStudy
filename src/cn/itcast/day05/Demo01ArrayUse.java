package cn.itcast.day05;
/*
访问数组元素的格式：
数组名称【索引值】
索引值：就是一个int数字，代表数组当中的元素编号，
【注意】索引值从0开始，一直到“数组的长度-1”为止
 */
public class Demo01ArrayUse {
    public static void main(String[] args) {
        int[] arrayA = {10,20,30};
        System.out.println(arrayA[0]);
        System.out.println(arrayA[1]);
        System.out.println(arrayA[2]);
        System.out.println("==========================");

        int num = arrayA[0];
        System.out.println(num);
    }
}
