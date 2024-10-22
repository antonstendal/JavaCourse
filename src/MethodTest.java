public class MethodTest {
    public static void main(String[] args) {

        Method method = new Method();
        int result = method.downloadResult();
        int resultTwo = result*2;
        System.out.println("Result multiplication:" + resultTwo);
        System.out.println("Result before multiplication:" + result);

    }
}
