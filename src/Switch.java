import java.util.Scanner;

public class Switch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please chose a car ");
        String car = scanner.next();

        switch (car) {
            case "bmw":
                System.out.println("This costs 2000$");
                break;

            case "fiat":
                System.out.println("This costs 1000$");
                break;

            case "volvo":
                System.out.println("This cost 1500$");
                break;
            default:
                System.out.println("I don't have this car here");
        }
    }
}
