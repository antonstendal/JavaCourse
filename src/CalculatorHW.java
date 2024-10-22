import java.util.Scanner;

public class CalculatorHW {
    Scanner scanner = new Scanner(System.in);
    int valueOne;
    int valueTwo;

    public int firstNumber() {
        System.out.print("Enter first number: ");
        valueOne = scanner.nextInt();
        return valueOne;
    }

    public int secondNumber() {
        System.out.print("Enter second number: ");
        valueTwo = scanner.nextInt();
        return valueTwo;
    }

    public int addition(){
        int additions = valueOne+valueTwo;
        System.out.println("Additions is: " + additions);
        return additions;
    }

    public int subtraction(){
        int subtraction = valueOne-valueTwo;
        System.out.println("Subtraction is: " + subtraction);
        return subtraction;
    }

    public int multiplication(){
        int multiplication = valueOne*valueTwo;
        System.out.println("Multiplication is: " + multiplication);
        return multiplication;
    }

    public int division(){
        int division = valueOne/valueTwo;
        System.out.println("Division is: " + division);
        return division;
    }

    public int mod(){
        int modulo = valueOne%valueTwo;
        System.out.println("Modulo is: " + modulo);
        return modulo;
    }



}
