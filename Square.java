/* 
Christian Noa
2/6/23
A program that uses the side length of a square to compute the perimeter and area of the square.
*/

import java.util.Scanner;

public class Square {
    
    public static void main(String[] args) {
        
        findSquareStuff(); // this method gets a number from the user 
                           // and outputs the perimeter and area of the square
        
    }
    
    // this method gets a number from the user,
    // calculates the perimeter and area of the square, and outputs them
    public static void findSquareStuff() {
    	
    	// Instantiate a Scanner to take input from the user
        Scanner scanner = new Scanner(System.in);
        
        // Prompt the user for side length and store the input in the variable length
        System.out.println("Enter the length:");
        double length = scanner.nextDouble();

                
        ///////////////////////    INSERT YOUR CODE BELOW THIS LINE    ///////////////////////
        //Blank Line
        System.out.println("");

        //Perimiter
        System.out.println("The perimeter of the square is " + length * 4);
        
        //Area
        System.out.println("The area of the square is " + length * length);
        ///////////////////////    INSERT YOUR CODE ABOVE THIS LINE    /////////////////////// 
        scanner.close();  
    }
}

/*
Where did you struggle with this coding work?
I did not struggle with this assignment at all.

What was easy?
Finding the perimeter and the area was pretty simple

What questions do you still have?
I have noq questions.
*/