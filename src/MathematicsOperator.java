public class MathematicsOperator {
    public static void main(String[] args) {
        int firstNumber = 4;
        int secondNumber = 6;
        float thirdNumber = 5F;

        int addition = firstNumber + secondNumber;
        int subtraction = firstNumber - secondNumber;
        int multiplication = firstNumber * secondNumber;
        float division = thirdNumber / secondNumber;
        int mod = secondNumber%firstNumber; // сколько раз 4 поместится в 6


        firstNumber+=secondNumber;
        System.out.println(firstNumber);//firstNumber = firstNumber + secondNumber
        firstNumber-=secondNumber;  //firstNumber = firstNumber - secondNumber
        System.out.println(firstNumber);
        firstNumber*=secondNumber;  //firstNumber = firstNumber * secondNumber
        System.out.println(firstNumber);
        firstNumber/=secondNumber;  //firstNumber = firstNumber / secondNumber
        System.out.println(firstNumber);
        secondNumber%=firstNumber;  //firstNumber = firstNumber % secondNumber
        System.out.println(secondNumber);
    }
}
