package day05;

/**
 * @author jiaoyl
 * @date 2020/7/5 20:02
 * 数组元素反转
 * 本来的样子[1,2,3,4,5]
 * 之后的样子[5,4,3,2,1]
 * 要求不能使用新数组，就用原来的数组。
 */
public class demo06ArrayReverse {
    public static void main(String[] args) {
        int[] array = {1,2,3,4,5,6};
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
        System.out.println("=================");
        //角标比较大小
        for (int min = 0,max=array.length-1; min < max;min++,max--) {
            int temp = array[max];
            array[max] = array[min];
            array[min] = temp;
        }
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }
}
