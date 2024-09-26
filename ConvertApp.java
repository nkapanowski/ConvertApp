// import java.util.Scanner;

import java.util.Scanner;

public class App {

    public static void main(String[] args) throws Exception {
        
        Scanner scanner = new Scanner(System.in);
        int userConverter = 0; // Stores users conversion option
        double userValue = 0; // Stores value that's being converted
        
        System.out.println("Welcome to Metric Converter!");
        System.out.println("Please choose a conversion option:");
        System.out.println("1 - Kilograms to Pounds");
        System.out.println("2 - Meters to Feet");
        System.out.println("3 - Celsius to Fahrenheit");
        System.out.println("4 - Liters to Gallons");
        System.out.println("Enter '-1' to exit.");

         // Main loop keeps running until the user exits
        while (true) {
            System.out.print("Enter your choice (1-4) or -1 to exit: ");
            userConverter = scanner.nextInt(); // Read user's choice
        
            if (userConverter == -1) {
                System.out.println("Exiting program.");
                break; // Exit loop
        }

            // Ask for the value to convert
            System.out.print("Enter the value to convert: ");
            userValue = scanner.nextDouble(); // Reads conversion value

            // Conversion details based on the user's input
            if (userConverter == 1) { // Kilograms to Pounds
                System.out.printf("%.2f kilograms = %.2f pounds\n", userValue, userValue * 2.20462);

            } else if (userConverter == 2) { // Meters to Feet
                System.out.printf("%.2f decimeters = %.2f centimeters\n", userValue, userValue * 10);

            } else if (userConverter == 3) { // Celsius to Fahrenheit
                System.out.printf("%.2f Celsius = %.2f Fahrenheit\n", userValue, (userValue * 1.8) + 32);

            } else if (userConverter == 4) { // Liters to Gallons
                System.out.printf("%.2f liters = %.2f gallons\n", userValue, userValue * 0.26417);

            } else {

                System.out.println("Invalid input. Please choose an option (1-4).");
                continue; // Goes back to start of the loop
            }       
        }           //Close
            scanner.close();
    }
}

