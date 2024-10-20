public class Arrays {
    public static void main(String[] args) {
        String[] winterMonths = new String[3];
        winterMonths[0] = "December";
        winterMonths[1] = "January";
        winterMonths[2] = "February";

        System.out.println(winterMonths[0] + winterMonths[1] + winterMonths[2]);
        int[] lottoNumbers = new int[]{1, 2, 3, 4, 5, 6};
        System.out.println(lottoNumbers[0]);
        System.out.println(lottoNumbers[1]);
        System.out.println(lottoNumbers[2]);
        System.out.println(lottoNumbers[3]);
        System.out.println(lottoNumbers[4]);
        System.out.println(lottoNumbers[5]);

        System.out.println(lottoNumbers.length);

        for (int i = 0; i < winterMonths.length; i++) {
            System.out.println(winterMonths[i]);
        }
    }
}
