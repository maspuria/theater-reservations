package com.pluralsight;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class TheaterReservations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // using scanner to read the user keyboards input

        // Ask the user for their full name
        // "Please enter your name: Geri Johnson"
        System.out.print("Please enter your name: ");
        String name = scanner.nextLine().trim();

        // Ask the user for the date of the show
        // "What date will you be coming (MM/dd/yyyy):"
        System.out.print("What date will you be coming(MM/dd/yyyy): ");
        String date = scanner.nextLine().trim();

        // Ask the user for the number of tickets they will need
        // "How many tickets would you like?"
        System.out.print("How many tickets would you like? ");
        String tickets = scanner.nextLine().trim();

        // Parse string into date
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM/dd/yyyy");
        LocalDate movieDate = LocalDate.parse(date, formatter);

        // Split name
        // the outcome should be "lastName, firstName"
        String[] namePosition = name.split(" ");
        String firstName = namePosition[0];
        String lastName = namePosition[1];

        // Convert String to Int
        // convert ticket to number
        int ticketAmount = Integer.parseInt(tickets);

        // Print confirmation information
        if (ticketAmount == 1) {
            System.out.println(ticketAmount + " ticket reserved for " + movieDate + " under " + lastName + ", " + firstName);
        } else {
            System.out.println(ticketAmount + " tickets reserved for " + movieDate + " under " + lastName + ", " + firstName);
        }

    }
}
