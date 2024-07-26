import java.io.IOException;
import java.util.Scanner;

 class Main {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        Boolean exit = false;

        while (!exit) {
            System.out.println("\n\n Would you like to create, write (persona), read or delete a file?");

            String answer = myObj.nextLine();
            if (answer.equals("create")) {
                CreateFile.main(args);
            } else if (answer.equals("write")) {
                System.out.println("What would you like to write to the file?");
                String writable = myObj.nextLine();
    
                WriteFile.main(writable);
            } else if (answer.equals("read")) {
                System.out.println("Which file would you like to read from?");
                String fileName = myObj.nextLine();

                ReadFile.main(fileName);
            } else if (answer.equals("delete")) {
                System.out.println("Which file would you like to delete?");
                String fileName = myObj.nextLine();
                DeleteFile.main(fileName);
            } else if (answer.equals("exit")) {
                exit = true;
            } else {
                System.out.println("Invalid input");
            }
        }
    } 
}
