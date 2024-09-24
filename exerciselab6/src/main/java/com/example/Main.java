package com.example;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();

        System.out.print("Choose a greeting (1: Formal, 2: Casual): ");
        int choice = scanner.nextInt();
        
        String greeting;
        if (choice == 1) {
            greeting = "Good day, " + name + "!";
        } else {
            greeting = "Hey, " + name + "! What's up?";
        }
        
        System.out.println(greeting);
        scanner.close();
    }
}