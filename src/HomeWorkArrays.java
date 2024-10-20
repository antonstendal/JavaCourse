public class HomeWorkArrays {
    public static void main(String[] args) {
        int num = 100;
        for (int i = 0; i <= num; i++) {
            if (i % 3 == 1) {
                System.out.println(i);
            }
        }

        int[] numbers = {1,3,5};
        System.out.println(numbers[2]);
        System.out.println(numbers[1]);
        System.out.println(numbers[0]);
    }
}
