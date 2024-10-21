public class MethodLubaPc {

    /*public void countResult() {
        System.out.println("now i will count result");
        int result = 0;
        for (int i = 0; i < 100; i++) {
            result = result + i;
        }
        System.out.println("Result: " + result);*/

        /*public int getResult() {
            System.out.println("now i will count result");
            int result = 0;
            for (int i = 0; i < 100; i++) {
                result = result + i;
            }
            System.out.println("Result: " + result);
            return result;*/

    public void countResultParam(int number) {
        System.out.println("Number is: " + number);
        System.out.println("now i will count result");
        int result = 0;
        for (int i = 0; i < number; i++) {
            result = result + i;
        }
        System.out.println("Result: " + result);
    }

    public int addNumber(int firstNumber, int secondNumber) {
        System.out.println("Summary is: " + (firstNumber + secondNumber));
        if (firstNumber == 0) {
            return 0;
        }
        return firstNumber+secondNumber;
    }
}
