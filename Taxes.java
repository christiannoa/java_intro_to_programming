/*
Christian Noa
4/12/23
A program that asks the user to enter their yearly income. The program then output the amount of federal taxes
they will have to pay given that the Federal Tax Rate is 15%
*/

import java.util.Scanner;

public class Taxes {
    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in);

        double income; // where income from user is stored

        // Prompt the user to enter a yearly income
        System.out.println("Enter your yearly income:\n");
        income = scanner.nextDouble();

        //Prints If statements if income is below 50,000
        if(income < 50000){
            double iOne = incomeOne(income);
            System.out.println("Income Bracket 1");
            System.out.println("You owe $" + iOne + " in Federal taxes.");
        }

        //Prints If statements if income is at or above 50,000 and at or below 99,999.99
        if((income >= 50000) && (income <= 99999.99)){
            double iTwo = incomeOne(income);
            System.out.println("Income Bracket 2");
            System.out.println("You owe $" + iTwo + " in Federal taxes.");
        }

        //Prints If statement if income is equal to or above 100,000
        if(income >= 100000){
            double iThree = incomeThree(income);
            System.out.println("Income Bracket 3");
            System.out.println("You owe $" + iThree + " in Federal taxes.");
        }

        scanner.close(); //closes scanner
    }

    //Income below $50,000: Income Bracket 1
    // multiply income * the federal tax and rounds to the nearest cent.
    public static double incomeOne(double income){
        double one = income * 0.15 * 100;
        one = Math.round(one) / 100.0;
        return one;
    }

    //Income of $50,000 - $99,999.99: Income Bracket 2
    // multiply income * the federal tax and rounds to the nearest cent.
    public static double incomeTwo(double income){
        double two = income * 0.15 * 100;
        two = Math.round(two) / 100.0;
        return two;
    }

    //Income of $100,000 or above: Income Bracket 3
    // multiply income * the federal tax and rounds to the nearest cent.
    public static double incomeThree(double income){
        double three = income * 0.15 * 100;
        three = Math.round(three) / 100.0;
        return three;
    }
}

/*
Where did you struggle with this coding work?
I struggled a bit with setting the argument/parameters.

What was easy?

The setup was easy. I'm starting to get the hang of it. Setting up the if statements was easy as well.

What questions do you still have?
Should I have setup the if-statements in a method?
*/