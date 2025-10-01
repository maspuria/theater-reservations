package com.pluralsight;

import java.util.Scanner;

public class TheaterReservations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // using scanner to read the user keyboards input

        // Ask the user for their full name
        // "Please enter your name: Geri Johnson"
        System.out.print("Please enter your name: ");
        String name = scanner.nextLine();

        // Ask the user for the date of the show
        // "What date will you be coming (MM/dd/yyyy):"
        System.out.print("What date will you be coming(MM/dd/yyyy): ");
        String date = scanner.nextLine();

        // Ask the user for the number of tickets they will need
        // "How many tickets would you like?"
        System.out.print("How many tickets would you like? ");
        String tickets = scanner.nextLine();


    }
}
