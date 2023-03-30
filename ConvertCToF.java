/*
Christian Noa
2/16/23
The user inputs a value (in degrees Celsius) and the
computer outputs the temperature in degrees Fahrenheit.
*/

import java.util.Scanner;

public class ConvertCToF {
    public static void main(String[] args) {

        // Input from user and conversion happens in the 'convert()' method
        // main method is calling covert
        convert();

    }
    public static void convert() {

        // Create a new Scanner to read in input from user
        Scanner scanner = new Scanner(System.in);

        // Prompt the user and then store their input in 'celsius'
        System.out.println("Temperature:");
        double celsius = scanner.nextDouble();

        // Convert celsius to Fahrenheit.
        double Fahrenheit = ((double) 9 / 5 * celsius) + 32;

        // Prints the conversion in Fahrenheit
        System.out.println("In Fahrenheit, the temperature is " + Fahrenheit);

        scanner.close();
    }
}


/*
Where did you struggle with this coding work?
I struggled with converting the integer into decimal

What was easy?
The conversion was easy since it was given.

What questions do you still have?
No questions

*/