public class Method {

   /* public void countTheResult () {
        System.out.println("Now i count the result");
        int result = 0;
        for (int i = 0; i < 100; i++) {
            result = result + i;
        }
        System.out.println("Your result: " +  result);
    }*/

    public int downloadResult() {
        System.out.println("Now i download the result");
        int result = 0;
        for (int i = 0; i < 100; i++) {
            result = result + i;
        }
        System.out.println("Your result: " + result);
        return result;
    }
}
