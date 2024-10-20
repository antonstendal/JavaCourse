import java.util.ArrayList;
import java.util.List;

public class HomeWorkArrays {
    public static void main(String[] args) {
//        int num = 100;
//        for (int i = 0; i <= num; i++) {
//            if (i % 3 == 0) {
//                System.out.println(i);
//            }
//        }

        int[] num = new int[]{1, 3, 2, 7, 5};
        for (int i = 0; i < num.length/2    ; i++) {
            int temp = num[i]; // for i=0 --> 1
            num[i] = num[num.length - 1 - i]; // changed first element array on last element
            num[num.length - 1 - i] = temp;
        }
        for (int i = 0; i < num.length; i++) {
            System.out.println(num[i]);
        }
    }
}
