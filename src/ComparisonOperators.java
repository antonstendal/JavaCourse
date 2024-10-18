import java.util.Scanner;

public class ComparisonOperators {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int firstNumber = scanner.nextInt();
        System.out.print("Enter second number: ");
        int secondNumber = scanner.nextInt();

        System.out.println("first number > second number " + (firstNumber > secondNumber));
        System.out.println("first number < second number " + (firstNumber < secondNumber));
        System.out.println("first number >= second number " + (firstNumber >= secondNumber));
        System.out.println("first number <= second number " + (firstNumber <= secondNumber));
        System.out.println("first number == second number " + (firstNumber == secondNumber));
        System.out.println("first number != second number " + (firstNumber != secondNumber));
    }
}
