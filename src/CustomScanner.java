import java.util.Scanner;

public class CustomScanner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter value: ");
        int value = scanner.nextInt();
        int result = value*value;
        System.out.println("Result: " + result);
    }
}
