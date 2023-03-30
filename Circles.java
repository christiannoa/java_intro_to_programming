/*
Christian Noa
2/16/23
Find the circumference and area of a circle with a radius that is provided by the user.
Also providing the rounded approximation of the area (to the nearest integer)
*/

import java.util.Scanner;
public class Circles {
    public static void main(String[] args) {

        calculate();

    }
    public static void calculate() {

        // Create a new Scanner to read in input from user
        Scanner scanner = new Scanner(System.in);

        // Prompt the user and then store their input in 'radius'
        System.out.println("Radius:");
        double radius = scanner.nextDouble();

        // Circumference of a circle
        double c = 2 * Math.PI * radius;

        // Area of a circle
        double a = Math.PI * radius * radius;

        //Circumference of circle
        System.out.println("CIRCUMFERENCE = " + c);

        //Area of circle
        System.out.println("AREA = " + a);

        //Rounded approximation area of circle
        System.out.println("ROUNDED AREA = " + Math.round(a));

        scanner.close();
    }
}

/*
Where did you struggle with this coding work?
I struggled with getting the rounded area.

What was easy?
The east part was getting the input and getting the circumference and area

What questions do you still have?
Could I have done the rounded area another way?
*/