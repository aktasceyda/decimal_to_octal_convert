package org.example;

import java.util.Scanner;

        public class Main {
            public static void main(String[] args) {
                // Create Scanner object to take user input
                Scanner scanner = new Scanner(System.in);

                // Prompt the user to enter a decimal number
                System.out.print("Enter a decimal number: ");
                int decimalInput = scanner.nextInt();

                // Call the function to convert decimal to octal
                String octalResult = decimalToOctal(decimalInput);

                // Print the result
                System.out.println("The octal representation of " + decimalInput + " is: " + octalResult);

                // Close the scanner
                scanner.close();
            }

            // Function to convert decimal to octal
            static String decimalToOctal(int decimalNum) {
                // Using Integer.toOctalString() to convert decimal to octal
                return Integer.toOctalString(decimalNum);
            }
        }
