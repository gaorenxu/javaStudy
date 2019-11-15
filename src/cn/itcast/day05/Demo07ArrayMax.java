package cn.itcast.day05;

public class Demo07ArrayMax {
    public static void main(String[] args) {
        int[] array = {5,15,25,30,20,10000};
        int max = 0;
        for (int i = 0; i < array.length; i++) {
            if(array[i] > max){
                max = array[i];
            }else{
                max = max ;
            }

        }
        System.out.println(max);
    }
}
