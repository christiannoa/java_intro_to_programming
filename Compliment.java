/*
Christian Noa
02/20/2023
This program will dole out a compliment if the user wants one.
There will be either 1 or 2 lines of output, depending on what the user chooses.
*/
import java.util.Scanner;
public class Compliment {
    public static void main(String[] args){

        // All the dirty work happens in the 'comp()' method;
        // calling 'comparison()' here in the main method.
        comp();

    }
    public static void comp() {

        // Create a new Scanner to read in input from user
        Scanner pick = new Scanner(System.in);

        // Prompt the user and then store their input in 'number'
        System.out.println("Would you like a compliment (\"1\" for YES, \"2\" for NO)?");
        int number = pick.nextInt();

            // if-else statement with pick result based off integer selected
            if (number == 1) {
                System.out.println("You are going to pass the class.");
                System.out.println("Game Over");
            } else {
                System.out.println("Game Over");
            }
    }
}

/*
Where did you struggle with this coding work?
I did not struggle with anything.

What was easy?
This code was pretty simple.

What questions do you still have?
no questions.

*/