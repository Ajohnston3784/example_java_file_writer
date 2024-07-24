package com.example.json.write;

import java.io.IOException;
import java.util.Scanner;
import org.json.simple.JSONObject;

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
            } else if (answer.equals("write persona")) {
                System.out.println("What is your name?");
                String name = myObj.nextLine();
                System.out.println("What is your age?");
                String age = myObj.nextLine();
                System.out.println("What is your quest?");
                String quest = myObj.nextLine();

                JSONObject persona = new JSONObject();
                persona.put("name", name);
                persona.put("age", age);
                persona.put("quest", quest);

                String fileName = name + ".json";
                writePersonaToFile.main(fileName, persona);

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
