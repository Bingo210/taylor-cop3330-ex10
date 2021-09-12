/*
 * UCF COP3330 Fall 2021 Assignment 10 Solution
 * Copyright 2021 Noah Taylor
 */

package org.example;

import java.util.Scanner;

public class App {
    public static void main( String[] args ) {
        Scanner input = new Scanner(System.in);

        // Prices could be doubles or floats, but I assumed it didn't matter too much
        System.out.println( "Enter the price of item 1: " );
        String firstItemPrice = input.nextLine();
        int item1price = Integer.parseInt(firstItemPrice);
        System.out.println( "Enter the quantity of item 1: " );
        String firstItemQuantity = input.nextLine();
        int item1quantity = Integer.parseInt(firstItemQuantity);
        System.out.println( "Enter the price of item 2: " );
        String secondItemPrice = input.nextLine();
        int item2price = Integer.parseInt(secondItemPrice);
        System.out.println( "Enter the quantity of item 2: " );
        String secondItemQuantity = input.nextLine();
        int item2quantity = Integer.parseInt(secondItemQuantity);
        System.out.println( "Enter the price of item 3: " );
        String thirdItemPrice = input.nextLine();
        int item3price = Integer.parseInt(thirdItemPrice);
        System.out.println( "Enter the quantity of item 3: " );
        String thirdItemQuantity = input.nextLine();
        int item3quantity = Integer.parseInt(thirdItemQuantity);


        int subtotal = (item1price * item1quantity) + (item2price * item2quantity) +
                (item3price * item3quantity);
        double tax = 0.055 * (double)subtotal;
        double total = subtotal + tax;

        System.out.println("Subtotal: $" + subtotal + "\n" + "Tax: $" +
                tax + "\n" + "Total: $" + total);
    }
}
