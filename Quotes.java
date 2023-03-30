/*
Christian Noa
2/21/23
The program asks the user to pick a number between 1 and 10. Depending on their choice,
a movie quote will be printed.
*/

import java.util.Scanner;
public class Quotes {
    public static void main(String[] args){

        // All the dirty work happens in the 'movieQuote()' method;
        // let's call it here from the main method!
        //exploring switch statements
        movieQuote();
    }

    //method for switch statement
    public static void movieQuote(){
        // Create a new Scanner to read in input from user
        Scanner insert = new Scanner(System.in);

        // Prompt the user and then store their input in 'choice'
        System.out.println("Enter a number 1-10:");
        int choice = insert.nextInt();

        // Prints out statement with users choice
        System.out.println("QUOTE " + choice + ":");

        // movie quotes in a switch statement based on users quote
        switch(choice) {
            case 1: System.out.println("Some Men Just Want To Watch The World Burn.");
            break;
            case 2: System.out.println("A Million Dollars Isn't Cool. You Know What's Cool? A Billion.");
            break;
            case 3: System.out.println("In Another Life, I Would Have Really Liked Just Doing Laundry And Taxes With You.");
            break;
            case 4: System.out.println("I Can Do This All Day.");
            break;
            case 5: System.out.println("Not Quite My Tempo.");
            break;
            case 6: System.out.println("We Accept The Love We Think We Deserve.");
            break;
            case 7: System.out.println("You Know What? He Just Left.");
            break;
            case 8: System.out.println("Gentlemen, You Had My Curiosity - But Now You Have My Attention.");
            break;
            case 9: System.out.println("So This Is What It Feels Like.");
            break;
            case 10: System.out.println("May The Odds Be Ever In Your Favour.");
            break;
            default: System.out.println("Try again. Pick a number from 1-10");
        }

        // Prints out statement to thank user
        System.out.println("Thank you for getting cultured.");

        insert.close();
    }
}

/*
Where did you struggle with this coding work?
I struggled initially with creating the switch statement. I did some further reading
to get the hang of it.

What was easy?
Finding movie quotes online.

What questions do you still have?
no questions
*/