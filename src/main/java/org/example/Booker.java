package org.example;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Scanner;
import java.util.Date;

public class Booker {
    public static void getUserInput() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the booking name: ");
        String nameInput = scanner.nextLine();

        System.out.println("Enter the booking date as dd-MMM-yyyy: ");
        String dateInput = scanner.next();
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MMM-yyyy");
        Date dateFormatted=null;
        try {
            dateFormatted = dateFormat.parse(dateInput);
        } catch (ParseException e) {
            e.printStackTrace();
        }

        System.out.println("Please enter the booking duration in hours: ");
        int durationInput = scanner.nextInt();

        Booking new_booking = new Booking(nameInput, dateFormatted, durationInput);

        System.out.printf("You have successfully made a new booking for %s on %s. It will last %d hours.", new_booking.getName(), new_booking.getDate(), new_booking.getDuration());
    }
}
