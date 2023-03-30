/* 
Christian Noa
2/6/23
Write a program that uses the height and the base of a 
triangle to compute the area of the triangle using the formula A = 1/2bh
*/

import java.util.Scanner;

public class TriangleArea {
    
    public static void main(String[] args) {
        
        findArea(); // this method gets numbers from the user and outputs the area of the triangle
        
    }
    
    // this method gets numbers from the user, calculates the area of the triangle, and outputs it
    public static void findArea() {
    	
    	// Instantiate a Scanner to take input from the user
        Scanner scanner = new Scanner(System.in);
        
        // Prompt the user for height and store the input in the variable 'height'
        System.out.println("Enter the height:");
        int height = scanner.nextInt();

        // Prompt the user for the base and store the input in the variable 'base'        
        System.out.println("Enter the base:");
        int base = scanner.nextInt();
        
        ///////////////////////    INSERT YOUR CODE BELOW THIS LINE    ///////////////////////
        // used double to get decimal and stored the multiplied height and base in a new variable
        double area = height * base;

        // Prints the result using the formula A = 1/2bh
        System.out.println("");

        // Prints the result using the formula A = 1/2bh
        System.out.println("The area of the triangle is " + (area / 2));
        
        ///////////////////////    INSERT YOUR CODE ABOVE THIS LINE    /////////////////////// 
        scanner.close();  
    }
}

/*
Where did you struggle with this coding work?
I struggled a bit with figuring out how to convert the final anwser 
to a decimal but figured it out after stepping away for a bit.

What was easy?
Printing an answer to the screen.

What questions do you still have?
No questions for this assignment.
*/