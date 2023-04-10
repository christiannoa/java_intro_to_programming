/*
Christian Noa
3/22/23
The game asks the user to guess a number between 1-100. The game ends when the user guesses the number correct.
*/

import java.util.Scanner;
import java.util.Random;
public class GuessANumber {
    public static void main(String[] args){
        guess(); //the method for guessing random number
    }

    //this method performs a random number and prompts the user to select an integer from 1-100
    public static void guess() {
        Scanner scanner = new Scanner(System.in); //scanner class
        Random random = new Random(); //random class
        int rand = random.nextInt(100) + 1; //random integer between 1-100

        int number;
        int numberOfGuesses = 0; //number of guesses start at 0
        boolean guessedCorrectly = false;

        //Prompt the user to enter a number between 1 and 100
        System.out.println("Welcome!");
        System.out.println("Please enter a number between 1 and 100:");

        // while loop with multiple conditionals based on users input
        while (!guessedCorrectly) {
            number = scanner.nextInt(); //saves user input
            numberOfGuesses++; //adds 1 everytime user guesses

            System.out.println(""); //blank line

            if (number == rand) {
                guessedCorrectly = true;
                System.out.println("Congratulations. You guessed correctly!"); // when the number guess is correct
                System.out.println("You needed " + numberOfGuesses + " guesses."); // total # of times before user got it right
                System.out.println(""); //blank line
            } else if (number > rand) {
                System.out.println("Too high. Guess again: "); //when the number guessed is too high
            } else {
                System.out.println("Too low. Guess again:"); // when the number guessed is too low
        }
    }
        scanner.close(); //scanner closing
    }
}

/*
Where did you struggle with this coding work?
I struggled with the while loop still. I guess I need to keep practicing it.

What was easy?
The multiple conditional statement was pretty easy. I seem to have the hang of it.


What questions do you still have?
I'm sure there were different ways of doing it. If i were to ask the user "Please enter a number between 1 and 100:"
in the while loop, it would've repeated it, would that have been wrong?
*/