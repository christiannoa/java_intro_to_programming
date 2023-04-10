/*
Christian Noa
4/4/23
a program that asks the user for an int and uses it as a seed for the random number generator. The program
then generates an 1) uppercase letter, 2) lowercase letter, 3) a digit between 0 and 9
*/
import java.util.Scanner;
import java.util.Random;
public class RandomChars {
    public static void main(String[] args){
        seed(); // make random things using a seed from the user
    }

    // this method asks the user for a seed for the random number generator
    // and then generates random numbers and chars
    public static void seed() {
        Scanner scanner = new Scanner(System.in);
        // Seeding the random number generator

        System.out.println("Enter a seed for the random number generator:");
        int seedNumber = scanner.nextInt(); //records user input

        Random random = new Random(seedNumber); // use the seed that the user entered as a parameter

        System.out.println("RANDOM:");

        // Random uppercase letter: 65 - 90
        int upper = random.nextInt(26) + 65;
        char randomUpper = (char)upper;
        System.out.println("Uppercase = " + randomUpper);

        // Random lowercase letter: 97 - 122
        int lower = random.nextInt(26) + 97;
        char randomLower = (char)lower;
        System.out.println("Lowercase = " + randomLower);

        // Random digit from 0-9: 48 - 57
        int digit = random.nextInt(10) + 48;
        char randomDigit = (char)digit;
        System.out.println("Digit = " + randomDigit);

        scanner.close(); //scanner closing
    }
}

/*
Where did you struggle with this coding work?
I struggled with converting the int to a char

What was easy?

the setup was very easy as well as using the seed number as the parameter

What questions do you still have?
no questions.
*/