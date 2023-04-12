/*
Christian Noa
4/11/23
Asks the user to enter a radius and then finds the circumference and area of a circle with radius while also providing
the rounded approximation of the area (to the nearest integer).
*/
import java.util.Scanner;

public class BetterCircles {

    // Main method runs the program (the major steps are in the methods)
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        double radius; // where radius from user is stored

        // Prompt the user and then store their input in 'radius'
        System.out.println("Radius:");
        radius = scanner.nextDouble();

        double c = circumference(radius); //circumference

        double a = area(radius); //area

        int rA = roundedArea(radius); //rounded area

        // displays circumference, area, and rounded area
        display(c, a, rA);

        scanner.close(); //closes scanner
    }

    // This method calculates the circumference and returns it to circumference
    public static double circumference(double radius){
        double calcCircumference = 2 * Math.PI * radius;
        return calcCircumference;
    }

    // This method calculates the area and returns it to area
    public static double area(double radius){
        double calcArea = Math.PI * radius * radius;
        return calcArea;
    }

    // This method calculates the rounded area and returns it to roundedArea
    public static int roundedArea(double radius){
        double calcRounded = Math.round(Math.PI * radius * radius);
        return(int) calcRounded;
    }

    // This method displays circumference, area, and rounded area (code displacer)
    public static void display(double c, double a, int rA){
        //Circumference of circle
        System.out.println("CIRCUMFERENCE = " + c);

        //Area of circle
        System.out.println("AREA = " + a);

        //Rounded approximation area of circle
        System.out.println("ROUNDED AREA = " + rA);
    }
}

/*
Where did you struggle with this coding work?
I struggled with displaying the circumference, area, and rounded area and once I figured that out by passing
the parameters from the main when calling display, I struggled with getting the correct rounded area. I had to cast
the "double" to an "int. I also struggled with a bit with setting up the variable and creating their methods but with
more practice, I assume I'll understand it more clearly

What was easy?
The math was pretty much done, so that part was pretty simple

What questions do you still have?
No questions.
*/