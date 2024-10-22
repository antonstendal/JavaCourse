import java.util.Scanner;

public class CalculatorHW {
    Scanner scanner = new Scanner(System.in);

    public int firstNumber() {
        int firstNumberInput = scanner.nextInt();
        return firstNumberInput;
    }

    public int secondNumber() {
        int secondNumberInput = scanner.nextInt();
        return secondNumberInput;
    }

    public int addition(){
        int additions = firstNumber()+secondNumber();
        System.out.println(additions);
        return additions;
    }



}
