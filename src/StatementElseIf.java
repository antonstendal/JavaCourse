public class StatementElseIf {
    public static void main(String[] args) {
        int number = 7;

        if (number == 0) {
            System.out.println("The number is 0");
        } else if (number > 10) {
            System.out.println("The number is > 10");
        } else if (number > 0) {
            System.out.println("The number is > 0");
        } else if (number < -5) {
            System.out.println("The number <-5");
        } else {
            System.out.println("The number is not correct");
        }
    }
}
