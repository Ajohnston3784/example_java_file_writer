import java.io.FileWriter;
import java.io.IOException;
import org.json.simple.JSONObject;

public class WritePersonaToFile {
    public static void main(String fileName, JSONObject persona) {
        try {
            FileWriter myJsonWriter = new FileWriter(fileName, true);
            System.out.println("The new person was successfully written to file: %s", fileName);
            
        } catch (IOException e) {
            System.out.println("An error occured writing the person to file. \n");
            e.printStackTrace();
        }
    }
}