import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class CheckedExceptions {

    public static void main(String[] args) {
        try {
            System.out.println("Before reading file");
            readFile("D:\\1 Anton\\Java\\src\\test.txt");
            System.out.println("Clothing file");

        } catch (FileNotFoundException e) {
            System.out.println("Exception is enable");
            System.out.println(e.getMessage());

        } finally {
            System.out.println("i am finally");
        }
    }

    public static void readFile(String path) throws FileNotFoundException {
        FileInputStream fileInputStream = new FileInputStream(path);
    }
}
