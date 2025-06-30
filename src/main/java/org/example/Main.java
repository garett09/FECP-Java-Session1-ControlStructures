package org.example;
import java.util.*;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double price = 0.00f;
        int age = 0;
        String membershipStatus = "";

        System.out.print("Enter membership status (Regular, VIP, Premium): ");

        membershipStatus = input.nextLine();
        String convertedMembership = membershipStatus.toLowerCase();

        System.out.print("Enter age: ");
        age = input.nextInt();


        if (convertedMembership.equals("regular")) {
            if (age < 18) {
                price = 50;
            } else if (age <= 64) {
                price = 100;

            } else {
                price = 75;
            }
            System.out.printf("Price: $%.2f",price);
        } else if (convertedMembership.equals("vip")) {
            if (age < 18) {
                price = 75;
            } else if (age <= 64) {
                price = 150;

            } else {
                price = 112.5;
            }
            System.out.printf("Price: $%.2f",price);
        } else if (convertedMembership.equals("premium")) {
            if (age < 18) {
                price = 100;
            } else if (age <= 64) {
                price = 200;

            } else {
                price = 150;
            }
            System.out.printf("Price: $%.2f",price);
    } else {
            System.out.print("Invalid membership status entered.");
        }
    }
}