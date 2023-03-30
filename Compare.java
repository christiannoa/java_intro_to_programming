/*
Christian Noa
02/20/2023
A program that prompts the user for an integer that compares the user's number to 10.
*/

import java.util.Scanner;
public class Compare {
    public static void main(String[] arg){

        // All the dirty work happens in the 'comparison()' method;
        // calling 'comparison()' here in the main method.
        comparison();
    }

    public static void comparison() {

        // Create a new Scanner to read in input from user
        Scanner scanner = new Scanner(System.in);

        // Prompt the user and then store their input in 'number'
        System.out.println("Enter an integer:");
        int number = scanner.nextInt();

        // program responds with results
        System.out.print("The number " + number);

            // if-else statement comparing users input to 10
            if (number > 10) {
                System.out.println(" is GREATER than 10.");
            } else {
                System.out.println(" is NOT GREATER than 10.");
            }

        // message that indicates that the program is done running.
        System.out.println("Program finished!");

        scanner.close();
    }
}

/*
Where did you struggle with this coding work?
Having the number print all in one line. had to play with print and println

What was easy?
everything lese was easy.

What questions do you still have?
No questions
*/