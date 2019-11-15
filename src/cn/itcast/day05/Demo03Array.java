package cn.itcast.day05;
/*
静态初始化的省略格式：
数据类型 [] 数组名称 = {元素1，元素2..}；

注意事项：
1.静态初始化没有直接指定长度，但是仍会自动推算长度
2.静态和动态初始化标准格式可以拆分成两个步骤。
3.静态初始化一旦使用了简化格式，就不能再拆分成两个步骤。

使用建议：
如果不确定数组中的具体内容，用动态初始化，否则，已经确定了具体的内容，用静态初始化。
 */
public class Demo03Array {
    public static void main(String[] args) {
        int[] arrayA = {10, 20,30};

        int[] arrayB;
        arrayB = new int[5];

        int[] arrayC;
        arrayC = new int[]{5,15,25};
    }
}
