package com.example;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
             System.out.print("Please enter your full name: ");
             String name = scanner.nextLine();
             System.out.println("Welcome to the Java World, " + name + "!");
             scanner.close();
         }
}