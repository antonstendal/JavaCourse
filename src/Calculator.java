import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int result;
        System.out.print("Enter first number: ");
        int firstNumber = scanner.nextInt();

        System.out.print("Enter second number: ");
        int secondNumber = scanner.nextInt();

        System.out.print("Chose operator: +-/* : ");
        String operator = scanner.next();
        if (operator.contains("+")) {
            result = firstNumber + secondNumber;
            System.out.print("Your result: " + result);
        }
        if (operator.contains("-")) {
            result = firstNumber - secondNumber;
            System.out.print("Your result: " + result);
        }
        if (operator.contains("*")) {
            result = firstNumber * secondNumber;
            System.out.print("Your result: " + result);
        }
        if (operator.contains("/")) {
            result = firstNumber / secondNumber;
            System.out.print("Your result: " + result);
        }
    }
}
