package files;

import java.io.File;
import java.io.IOException;

public class CreateFiles {
    public static void main(String[] args) throws IOException {

        File file = new File("text.txt");
        if(file.createNewFile()){
            System.out.println("Create new file");
        } else {
            System.out.println("The file is created");
        }

    }
}
