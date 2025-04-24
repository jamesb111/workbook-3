package com.pluralsight;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class SearchEngineLoggerApp {
    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {

            System.out.println("Would you like to launch the search app? (Y/N)");
            String userChoice = scan.nextLine();

            //checks if user wants to launch app
            if(userChoice.equals("y")) {
                logActions();
            }

    }
    static void logActions() {
        boolean appRunning = true;
        try {
            //file writer!!
            FileWriter writer = new FileWriter("src/main/resources/logs.txt", true);
            BufferedWriter bufWriter = new BufferedWriter(writer);

            //get todays date with format
            LocalDateTime rightNow = LocalDateTime.now();
            DateTimeFormatter format2 = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
            String dateFormatted = rightNow.format(format2);

            //display app launch here
            bufWriter.write(dateFormatted + " App launched \n");

            while(appRunning) {
                System.out.println("What would you like to search for? (X to exit)");
                String logEntry = scan.nextLine();
                if(!logEntry.equals("x")) {
                    bufWriter.write(dateFormatted + " " + "search : " + logEntry + "\n");
                    System.out.println("Would you like to search again? (Y/N)");
                    String yesOrNo = scan.nextLine();
                    if(yesOrNo.equals("y")) {
                        continue;
                    } else {
                        bufWriter.write(dateFormatted + " Exited app \n");
                        appRunning = false;
                    }

                } else {
                    bufWriter.write(dateFormatted + " Exited app \n");
                    appRunning = false;
                }
            }
            bufWriter.close();


        } catch (Exception e) {
            System.out.println("Search didnt work brodie");
        }
    }
}
