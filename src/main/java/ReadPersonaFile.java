import java.io.FileReader;
import java.io.IOException;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class ReadPersonaFile {
    public static JSONObject readJsonFromFile(String fileName) {
        JSONParser jsonParser = new JSONParser();
        JSONObject jsonObject = null;

        try (FileReader reader = new FileReader(fileName)) {
            // Parse the JSON file
            Object obj = jsonParser.parse(reader);
            jsonObject = (JSONObject) obj;
            System.out.println("JSON Object: " + jsonObject);
        } catch (IOException | ParseException e) {
            e.printStackTrace();
        }

        return jsonObject;
    }
}