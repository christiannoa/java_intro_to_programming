/*
Christian Noa
02/21/23
The program will ask the user to input a whole number.
Then the program will print out the sign of the number. (positive, negative, or zero)
*/

import java.util.Scanner;
public class Sign {

    public static void main(String[] args) {

        // All the dirty work happens in the 'signage()' method;
        // calling it here on main method
        signage();

    }
    public static void signage() {

        // Create a new Scanner to read in input from user
        Scanner input = new Scanner(System.in);

        // Prompt the user and then store their input in 'wholeNumber'
        System.out.println("Enter a whole number:");
        int wholeNumber = input.nextInt();

        // Multiple if-else constructs
        if (wholeNumber >= 1) {
            System.out.println("The number is positive.");
        } else if (wholeNumber <= -1) {
            System.out.println("The number is negative.");
        } else {
            System.out.println("The number is zero.");
        }

        input.close();
    }
}

/*
Where did you struggle with this coding work?
I struggled a bit with the greater/less than sign. Not sure why. I realized that I was using
the signs the wrong way

What was easy?
THe program was pretty simple. This time I was using else if {} compared to previous
programs.


What questions do you still have?
Np questions.

*/