package day05;

/**
 * @author jiaoyl
 * @date 2020/7/5 20:30
 *
 *
 */
public class demo07ArrayParam {
    public static void main(String[] args) {
        int[] array = {1,2,3,4,5,6};
        arrayParam(array);
    }

    public static void arrayParam(int[] array){
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }
}
