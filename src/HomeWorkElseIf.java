import java.util.Scanner;

public class HomeWorkElseIf {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Hello. How old are you? ");
        int age = scanner.nextInt();
        if (age < 18 && age>=0) {
            System.out.println("You cant by this product. Sorry. See you later");
        } else if (age >= 18) {
            System.out.println("Thank you for your change! You are welcome.");
        }
    }
}
