package com.pluralsight;
import java.io.FileInputStream;
import java.util.Scanner;

public class BedTimeStoriesApp {
    public static void main(String[] args) {
        Scanner userScan = new Scanner(System.in);

        System.out.println("What story would you like to read?");
        String storyName = userScan.nextLine();

        try {
            FileInputStream fis = new FileInputStream("src/main/resources/" + storyName);
            Scanner scanFis = new Scanner(fis);

            String fileInput;
            int lineCounter = 0;
            while(scanFis.hasNextLine()) {
                lineCounter++;
                fileInput = scanFis.nextLine();
                System.out.println(lineCounter + ": " + fileInput);
            }
        } catch (Exception e) {
            System.out.println("Story does not exist");
        }







    }

}
