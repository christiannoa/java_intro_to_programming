/*
Christian Noa
2/28/23
Obtain input from the user & output result of various String methods from the input.
*/

import java.util.Scanner;
public class StringLab01 {
    public static void main(String[] args){

        //This program will give information about the users input
        //Length of String, first position, last position,
        //First occurrence of character, and it's position/index
        phrase();
    }

    //this method performs various string methods based on users phrase and character.
    public static void phrase(){
        //Scanner to read in input from user
        Scanner sc = new Scanner(System.in);

        //User input phrase
        System.out.println("Please enter a phrase:");
        String words = sc.nextLine();

        //blank line
        System.out.println();

        //User input character to search for
        System.out.println("Please enter a character to search for:");
        String letter = sc.nextLine();

        //blank line
        System.out.println();

        //Length of String
        System.out.println("The length of your String is " + words.length() + ".");

        //character in the first position
        System.out.println("The character in the first position is " + "'" + words.charAt(0) + "'" + ".");

        //character in the last position
        System.out.println("The character in the last position is " + "'" + words.charAt(words.length()-1) + "'" + ".");

        //First occurrence of character and it's position/index
        System.out.println("The first occurrence of " + "'" + letter + "'" + " is in index " + words.indexOf(letter) + ".");

        sc.close();
    }
}

/*
Where did you struggle with this coding work?
I struggled with finding the position/index of the phrase. It took me awhile but I got it. I had to
step away and come back to it.

I also took longer than usual finding the last position. I had to think about it.

What was easy?
the length of the string and finding the first position was relatively easy

What questions do you still have?
Will we continue to build and work on javas API's? are we  going to explore ones that are not in the book?
*/