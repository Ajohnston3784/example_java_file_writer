import java.io.File;

public class DeleteFile {
    public static void main(String arg) {
        File fileToDelete = new File(arg);
        if (fileToDelete.delete()) {
            System.out.printf("Delete the file: %s", fileToDelete.getName());
        } else {
            System.out.printf("Failed to delete the file %s.", fileToDelete.getName());
        }
    }
}