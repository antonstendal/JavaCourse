public class MethodOverloadingTest {
    public static void main(String[] args) {

        MethodOverloading methodName = new MethodOverloading();
        methodName.add();
        methodName.add(1);
        methodName.add("overloading");
        methodName.add(2,2);
        methodName.add(1,1,1);

    }
}
