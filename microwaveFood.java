/*
* This program calculates the energy an object can release
*
* @author  Cristiano Sellitto
* @version 1.0
* @since   2024-02-20
*/

import java.util.Scanner;

/**
* This is the program.
*/
final class microwaveFood {
    /**
    * Prevent instantiation.
    * Throw an exception IllegalStateException.
    * if this is ever called
    *
    * @throws IllegalStateException if this is ever called
    *
    */
    private microwaveFood() {
        throw new IllegalStateException("Cannot be instantiated");
    }

    /**
    * The starting main() function.
    *
    * @param args No args will be used
    */
    public static void main(final String[] args) {
        // Get input
        final Scanner input = new Scanner(System.in);
        System.out.print("Enter mass (kg): ");

        // Check if input is valid
        try {
            final double mass = Float.parseFloat(input.nextLine());
            if (mass < 0) {
                // Input is invalid
                Integer.parseInt(null);
            } else {
                // Calculate energy
                final double energyReleased = mass * Math.pow(
                    2.998 * Math.pow(10, 8), 2
                );

                // Print output
                System.out.println(
                    "A " + mass + "kg object would produce "
                    + energyReleased + " J of energy."
                );
            }
        } catch (NumberFormatException e) {
            // Input is invalid
            System.out.println("Invalid input.");
        }

        // Close scanner
        input.close();

        // Show the program as done
        System.out.println("\nDone.");
    }
}
