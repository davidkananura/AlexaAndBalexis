/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vu.alexaandbalexis;

/**
 *
 * @author DAVID'S-PC
 */
import java.util.Scanner;

public class NumberOperators {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter three numbers
        System.out.print("Enter the first number: ");
        int num1 = scanner.nextInt();

        System.out.print("Enter the second number: ");
        int num2 = scanner.nextInt();

        System.out.print("Enter the third number: ");
        int num3 = scanner.nextInt();

        // Calculate the product, sum, and maximum of the numbers
        int product = num1 * num2 * num3;
        int sum = num1 + num2 + num3;
        int max = Math.max(num1, Math.max(num2, num3));

        // Display the results in a tabular format
        System.out.println("\n----------------------------");
        System.out.printf("%-10s%-10s%-10s%n", "Product", "Sum", "Maximum");
        System.out.println("----------------------------");
        System.out.printf("%-10d%-10d%-10d%n", product, sum, max);
        System.out.println("----------------------------");

        scanner.close();
    }
}

