/*
Christian Noa
2/16/23
Collect words/phrases to create a fun, creative, and unique story.
*/

import java.util.Scanner;
public class MadLibs {
    public static void main(String[] args) {

        wordsPhrases();
    }
    public static void wordsPhrases() {

        // Create a new Scanner to read in input from user
        Scanner scanner = new Scanner(System.in);

        // Word 1
        System.out.println("Please enter a name:");
        String name = scanner.nextLine();

        // Capitalized the first letter of a string
        String capitalizedName = name.substring(0, 1).toUpperCase() + name.substring(1);

        // Word 2
        System.out.println("Please enter a song:");
        String song = scanner.nextLine();

        // Word 3
        System.out.println("Please enter a producer:");
        String producer = scanner.nextLine();

        // Word 4
        System.out.println("Please enter a album:");
        String album = scanner.nextLine();

        // Word 5
        System.out.println("Please enter a city:");
        String city = scanner.nextLine();

        // Word 6
        System.out.println("Please enter a state:");
        String state = scanner.nextLine();

        // Word 7
        System.out.println("Please enter a food:");
        String food = scanner.nextLine();

        // Word 8
        System.out.println("Please enter a drink:");
        String drink = scanner.nextLine();

        // Word 9
        System.out.println("Please enter a shoe:");
        String shoe = scanner.nextLine();

        // Word 10
        System.out.println("Please enter a brand:");
        String brand = scanner.nextLine();

        // word 11
        System.out.println("Please enter a car:");
        String car = scanner.nextLine();

        // word 12
        System.out.println("Please enter a date:");
        String date = scanner.nextLine();

        //Thanks the user for input and pauses before printing story
        System.out.println("Thank you for you responses");
        try {
            Thread.sleep(2000); // pause for 2 second
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Original story
        System.out.println("My favorite artist is " + capitalizedName + ". " + capitalizedName + " has many great songs "
                + "but my favorite is " + song + ". " + "The producer of this song is " + producer + ". " + "The name of "
                + "the album is " + album + ". " + capitalizedName + " is from " + city + " in the state of " + state +
                ". " + capitalizedName + " likes to eat " + food + " and drink " + drink + ". " + capitalizedName +
                " likes to wear " + shoe + " and wear " + brand + ". " + capitalizedName + " drives a " + car +
                " that was purchased " + date + ".");

        scanner.close();
    }
}

/*
Where did you struggle with this coding work?
I struggled with writing a coherent story

What was easy?
The easiest part was creating the information for the user

What questions do you still have?
Does the story need to be funny or just needs to be a story?
*/
