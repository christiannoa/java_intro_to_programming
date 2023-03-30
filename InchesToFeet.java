/* 
Christian Noa
02/08/2023
The program that will ask the user for a number of total inches. Then convert the total inches into feet and inches. 
*/

import java.util.Scanner;

public class InchesToFeet {
	public static void main(String[] args) {

		// All the dirty work happens in the 'convert()' method; let's call it here from the main method!
		convert();      
             
	}
   
	// this method asks the user for total inches and outputs the conversion to feet and inches
    public static void convert() {

	   // Create a new Scanner to read in input from user
	   Scanner scanner = new Scanner(System.in);
      
       // Prompt the user and then store their input in 'totalInches'
       System.out.println("Enter the number of inches:");
       int totalInches = scanner.nextInt();

       // Convert to feet and inches. 
	   // ex. if totalInches is 38, the output would be: 38 inches is 3 feet, and 2 inches

       ///////////////////////    INSERT YOUR CODE BELOW THIS LINE    ///////////////////////
       System.out.println("");

       int foot = totalInches / 12; // Gives the conversion in "feet"
       int inch = totalInches % 12; // Gives the remainder of input conversion in "inches"

       //displays the conversion in feet and inches
       System.out.println(totalInches + " inches is " + foot + " feet, and " + inch + " inches");
	    
       ///////////////////////    INSERT YOUR CODE ABOVE THIS LINE    ///////////////////////

       scanner.close();   

   }
}

/*
Where did you struggle with this coding work?
I was struggling with getting the remainder. I would get the user input, as well as the "Feet"
but couldn't get the remainder right awat

What was easy?
The conversion part was east. I just had to get the total inches that was input and divide it by 12
since every 12 inches = a foot.

What questions do you still have?
Was there another way to execute this program?
*/