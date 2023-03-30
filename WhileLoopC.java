/*
Christian Noa
3/23/23
a program that asks the user for a starting number and a number to increase by (incrementor).
*/

import java.util.Scanner;
public class WhileLoopC {
    public static void main(String[] args){
        increment(); //calling the next 5 number based on user increment input
    }
    // prompts user to enter a number, then increment number, then I initialize a "count" variable
    // to start count at 0, lastly create a "while" loop to increment by users increment number
    // until it ouputs the next 5 number
    public static void increment(){
        Scanner scanner = new Scanner(System.in);

        //user inputs starting number
        System.out.println("Enter starting number:");
        int number = scanner.nextInt();

        System.out.println(""); // blank line

        //user inputs increment number
        System.out.println("Enter incrementor:");
        int inc = scanner.nextInt();

        System.out.println(""); // blank line

        int count = 0; // starting count at 0

        System.out.println(number); // prints initial number

        // while loop to output next 5 numbers based on user increment number
        while (count < 5) {
            number += inc;
            System.out.println(number); // outputs initial number and next 10
            count++;
        }

        scanner.close(); //scanner closing
    }
}

/*

Where did you struggle with this coding work?
I struggled with incrementing the number correctly. I was close but was adding "inc ++" i/o of "number += inc", which
makes more sense

What was easy?
setting up the prompt for the user and creating the bones of the while loop.

What questions do you still have?
Is there a way to start with the initial number i/o of printing that first and then starting the while loop?

*/