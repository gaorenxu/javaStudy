package cn.itcast.day05;
/*
使用动态初始化数组的时候，其中的元素会自动拥有一个默认值：
如果是整数类型，那么默认为0
如果是浮点类型，那么默认为0.0
如果是字符类型，那么默认为‘\u0000’
如果是布尔类型，那么默认为false
如果是引用类型，呢么默认为null

注意事项：
静态初始化也有默认值，只不过系统自动马上将默认值替换为大括号中的数值
 */
public class Demo05ArrayUse {
    public static void main(String[] args) {
        int[] array =new int[3];
        System.out.println(array[0]);
        System.out.println(array[1]);
        System.out.println(array[2]);
        System.out.println("============");
         array[1] = 123;
        System.out.println(array[1]);
    }
}
