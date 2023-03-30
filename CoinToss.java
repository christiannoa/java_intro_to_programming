/* 
Christian Noa
02/20/23
In this program the computer simulates flipping a coin (0 is heads and 1 is tails).
The user guesses what the computer got, and the computer reports if they
guessed correctly or not.
*/

import java.util.Scanner;

public class CoinToss {

    public static void main(String[] args) {

        headsOrTails(); // the computer simulates flipping a coin
        // and the user guesses the result

    }

    // In this method, the computer simulates flipping a coin.
    // The user guesses the result, and the computer reports if they are correct.

    // The computer will use 0 to represent "heads" and 1 to represent "tails"
    // on the coin toss.

    public static void headsOrTails() {

        // computer randomly picks a number 0 or 1
        int flip = (int)(Math.random()*2);

        ///////////////////////    INSERT YOUR CODE BELOW THIS LINE    ///////////////////////
        // Create a new Scanner to read in input from user
        Scanner input = new Scanner(System.in);

        // Prompt the user and then store their input in 'guess'
        System.out.println("0 is heads and 1 is tails.");

        // Prompt the user and then store their input in 'guess'
        System.out.println("What is your guess (0 or 1)?");
        int guess = input.nextInt();

            // if-else statement
            if (flip == guess){
                System.out.println("The computer got " + flip + ".");
                System.out.println("You guessed right!");
            } else {
                System.out.println("The computer got " + flip + ".");
                System.out.println("Sorry, try again next time!");
            }
        ///////////////////////    INSERT YOUR CODE ABOVE THIS LINE    ///////////////////////
    }

}

/*
Where did you struggle with this coding work?
I did at all in this assignment.

What was easy?
The if-else statement are particularly easy now that I have the hang of it.

What questions do you still have?
no questions to ask.
*/