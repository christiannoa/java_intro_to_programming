// Christian Noa
// 2/2/2023
// This program prints a rectangle to the screen. 5 characters across and 4 characters down.

public class Rectangle {
    public static void main(String[] args) {

        printRectangle();
    }
    
    //this method prints a rectangle to the screen
    public static void printRectangle() {
        System.out.print("*****"); //prints 5 stars across
        System.out.println(""); //moves cursor to a newline
        System.out.print("*" + " " + " " + " " + "*"); //prints 2 stars across w/ 3 empty strings in between
        System.out.println(""); //prints 5 stars across
        System.out.print("*" + " " + " " + " " + "*"); //prints 2 stars across w/ 3 empty strings in between
        System.out.println(""); //moves cursor to a newline
        System.out.print("*****"); //prints 5 stars across
    }
}

/*
Where did you struggle with this coding work?
I was struggling with figuring out how to create the the "2" stars in it's seperate line

What was easy?
Creating all the stars needed was pretty simple

What questions do you still have?
No questions for now.
*/
