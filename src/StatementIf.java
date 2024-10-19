public class StatementIf {
    public static void main(String[] args) {
        float firstNum = 4.0F; //dzielna
        float secondNum = 2.0F; //dzielnik

        if (secondNum != 0) {
            System.out.println("Result division: " + (firstNum/secondNum));
        } else {
            System.out.println("You entered '0'. Try again");
        }

    }
}
