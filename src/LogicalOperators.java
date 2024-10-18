public class LogicalOperators {
    public static void main(String[] args) {

        boolean firstValue = 2>1;
        boolean secondValue = 2<1;
        boolean thirdValue = 2==1;
        boolean fourthValue = 2!=1;

        //"and" && -> true when ALL expressions are = true
        System.out.println(firstValue && secondValue); // false
        System.out.println(firstValue && fourthValue); // true

        //"or" || ->  true when ONE expression is = true
        System.out.println(firstValue || secondValue); //true
        System.out.println(thirdValue || secondValue); //false


        // ! negation return value the opposite in the start expression
        System.out.println(!firstValue); //false
        System.out.println(!secondValue); //true
        System.out.println(!(firstValue || secondValue)); // false
        System.out.println(!(firstValue && secondValue)); // true
    }
}
