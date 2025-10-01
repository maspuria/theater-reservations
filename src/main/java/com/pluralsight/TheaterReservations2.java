package com.pluralsight;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class TheaterReservations2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // ask user to enter full name
        System.out.println("Please enter your name: ");
        String name = scanner.nextLine();
        // split name
        String[] nameSplit = name.trim().split(" ");

        // ask user how many tickets they would like
        System.out.println("How many tickets would you like? ");
        int ticketAmount = scanner.nextInt();
        scanner.nextLine();


        // ask user what date they will be going to the theater
        System.out.println("What date will you be coming(MM/dd/yyyy): ");
        String dateAsString = scanner.nextLine();
        //Parse String to Date
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM/dd/yyyy");
        LocalDate date = LocalDate.parse(dateAsString, formatter);

//      output: 3 tickets reserved for 2023-05-13 under Johnson, Geri
//      output: 1 ticket reserved for 2023-05-13 under Johnson, Geri
        System.out.printf("%d tickets reserved for %s under %s, %s",
                ticketAmount, date, nameSplit[1], nameSplit[0]);



    }
}
