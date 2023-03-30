/*
Christian Noa
3/22/23
a program that will ask the user for a number
and then output the next 10 consecutive numbers.
*/

import java.util.Scanner;
public class WhileLoopB {
    public static void main(String[] args){
        nextTen(); //calling the next ten numbers based on user input here in the main method
    }
    // prompts user to enter a number, then stores the number in a variable, then I initialized another variable
    // to start count at 0, lastly  creating a while loop to increment both variables by 1
    // until it reached the tenth consecutive number.
    public static void nextTen(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number:");
        int number = scanner.nextInt();

        int count = 0; // starting count at 0

        System.out.println(""); // blank line

        // while loop to output next 10 numbers
        while (count < 10) {
            number++;
            System.out.println(number); // outputs initial number and next 10
            count++;
        }

        scanner.close(); //scanner closing
    }
}

/*

Where did you struggle with this coding work?
I struggled with getting the next 10 numbers. I created the 2 variable but did not include both in the while loop.
then I did put both in the while loop but didn't put the "number" variable ahead of the print.

What was easy?
setting up the prompt for the user and creating the bones of the while loop.

What questions do you still have?
Do you recommend any more resources other than the book/youtube to help me fully understand this?
This is just a few lines of code but I found it a bit complex for some reason.

*/