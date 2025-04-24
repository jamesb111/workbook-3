package com.pluralsight;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

import java.time.LocalDateTime;

public class FormatDatesApp {
    public static void main(String[] args) {
        //get current date and time
        LocalDateTime today = LocalDateTime.now();

        //date patterns
        DateTimeFormatter format1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        DateTimeFormatter format2 = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        DateTimeFormatter format3 = DateTimeFormatter.ofPattern("MMMM dd, yyyy");

        DateTimeFormatter format4 = DateTimeFormatter.ofPattern("EEEE, MMM d, yyyy HH:mm");

        //Experimental code
        //String formatedDatee4 = today.format(format4.withZone(ZoneId.of("GMT")));

        //holding date format patterns in variables
        String formatedDatee1 = today.format(format1);
        String formatedDatee2 = today.format(format2);
        String formatedDatee3 = today.format(format3);
        String formatedDatee4 = today.format(format4);

        System.out.println(formatedDatee1);
        System.out.println(formatedDatee2);
        System.out.println(formatedDatee3);
        System.out.println(formatedDatee4);


    }
}
