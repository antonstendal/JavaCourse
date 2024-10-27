package userAge;

import java.util.Scanner;

public class UserAgeTest {
    public static void main(String[] args) throws NoValidUserAgeException {

        System.out.print("Enter your age: ");
        Scanner scanner = new Scanner(System.in);
        int age = scanner.nextInt();
        if (age <= 0){
            throw new NoValidUserAgeException("Your age is invalid");
        } else if (age > 18) {
            System.out.println("Welcome");
        } else if (age <= 18) {
            System.out.println("Sorry");

        }
    }
}
