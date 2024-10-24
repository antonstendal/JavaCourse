public class ReadOnlyTest {
    public static void main(String[] args) {
        ReadOnly readOnly = new ReadOnly();


        System.out.println("Name " + readOnly.getName());
        readOnly.setName("Raul");
        System.out.println("Next  name " + readOnly.getName());

        System.out.println("Anton age " + readOnly.getAge());
        readOnly.setAge(28);
        System.out.println("Raul age " + readOnly.getAge());
    }
}
