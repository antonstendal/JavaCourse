package files;

import java.io.FileWriter;
import java.io.IOException;

public class WriteToFile {
    public static void main(String[] args) throws IOException {
        FileWriter fileWriter = new FileWriter("text.txt");
        fileWriter.write("New  tex");
        fileWriter.close();
    }

}
