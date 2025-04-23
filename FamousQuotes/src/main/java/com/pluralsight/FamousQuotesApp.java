package com.pluralsight;
import java.util.Scanner;
public class FamousQuotesApp {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        boolean isRunning = true;

        String[] quotes = {
                "I think, therefore I am.",
                "Veni, vidi, vici.",
                "To be, or not to be.",
                "I have a dream.",
                "Injustice anywhere is a threat to justice everywhere.",
                "Speak softly and carry a big stick.",
                "Time is money.",
                "Knowledge is power.",
                "Let them eat cake.",
                "Stay hungry, stay foolish."
        };

        while(isRunning) {
            double randomNum = Math.random() * 10;
            int ranNum = (int)randomNum;

            System.out.println("Pick a number between 1 and 10");
            int userNum = scan.nextInt();
            try {
                System.out.println(quotes[userNum-1]);
            }
            catch (Exception e) {
                System.out.println("Your number is out of range");
                continue;
            }

            scan.nextLine();

            System.out.println("Do you want to continue y/n?");
            String yayOrNay = scan.nextLine();

            if(yayOrNay.equals("y")) {
                System.out.println("Would you like to generate a random quote?");
                String yOn = scan.nextLine();

                if(yOn.equals("y")) {
                    System.out.println(quotes[ranNum]);
                } else {
                    continue;
                }
            } else if(yayOrNay.equals("n")) {
                isRunning = false;
            }

            scan.nextLine();




        }




    }
}
