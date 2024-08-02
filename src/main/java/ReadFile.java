import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReadFile {
    public static void main(String arg) {
        try {
            File newReader = new File(arg);
           Scanner myReader = new Scanner(newReader);
           while (myReader.hasNextLine()) {
            String data = myReader.nextLine();
            System.out.println(data);
           }
           myReader.close();
        } catch (FileNotFoundException e) {
            System.out.printf("An error occured reading the file %s. \n", arg);
            e.printStackTrace();
        }
    }
}