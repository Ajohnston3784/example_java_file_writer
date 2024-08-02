import java.io.File;
import java.io.IOException;

public class CreateFile {
    public static void main(String[] args) {
        try {
            File myNewFile = new File("testFile.txt");
            if (myNewFile.createNewFile()) {
                System.out.println("File created: " + myNewFile.getName());
            } else {
                System.out.println("File already exists.");
            }
        } catch (IOException e) {
            System.out.println("An error occured creating file");
            e.printStackTrace();
        }
    }
 }
