import java.io.FileWriter;
import java.io.IOException;

public class WriteFile {
    public static void main(String arg) {
        try {
            FileWriter myWriter = new FileWriter("testFile.txt", true);
            myWriter.write(arg + "\n");
            myWriter.close();
            System.out.println("Successfully wrote to the file.");
        } catch (IOException e) {
            System.out.println("An error occured writing to file");
            e.printStackTrace();
        }
 
    }
 }