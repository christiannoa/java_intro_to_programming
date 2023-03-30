/*
Christian Noa
2/16/23
The machine counts the pennies, takes a percentage, and then issue a receipt that
the customer can take to Customer Service and exchange for cash.
*/

import java.util.Scanner;
public class CoinStar {
    public static void main(String[] args) {

        count();

    }
    public static void count() {

        // Create a new Scanner to read in input from user
        Scanner scanner = new Scanner(System.in);

        // Prompt the user and then store their input in 'radius'
        System.out.println("How many pennies did you insert?");
        int pennies = scanner.nextInt();

        // divided integer by 100.0 to ensure floating-point arithmetic to get decimal value
        double deposit = pennies / 100.0;

        //percentage for processing fee
        final double PERCENT = .20;

        //subtract total deposit by the total processing fee
        double earned = deposit - (deposit * PERCENT);

        //prints out total value deposit
        System.out.println("You have deposited $" + deposit);

        //prints out total processing fee
        System.out.println("The processing fee is $" + deposit * PERCENT);

        //prints out total earnings after processing fee
        System.out.println("You earned $" + earned);

        scanner.close();
    }
}

/*
Where did you struggle with this coding work?
I struggled with converting the number into a decimal

What was easy?
getting the processing fee was east once I figured how to get the decimal

What questions do you still have?
Is this the best way to do this?
*/