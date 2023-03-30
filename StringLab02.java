/*
Christian Noa
3/1/23
Obtain input from the user & output result of various String methods from the input.
*/
import java.util.Scanner;

public class StringLab02 {
    public static void main(String[] args){
        menu(); //explores the indicated task on the phrase the user entered.
    }
    //this method performs switch statements, conditional, and multiple conditional statements.
    public static void menu(){
        //Scanner to read in input from user
        Scanner sc = new Scanner(System.in);

        //User input phrase
        System.out.println("Please enter a phrase:");
        String phrase = sc.nextLine();

        //blank line
        System.out.println();

        //Menu list 1-8
        System.out.println("1. Find the length of the string");
        System.out.println("2. Perform charAt");
        System.out.println("3. Perform equals");
        System.out.println("4. Perform compareTo");
        System.out.println("5. Perform indexOf");
        System.out.println("6. Perform substring");
        System.out.println("7. Perform toLowerCase");
        System.out.println("8. Perform toUpperCase");

        //blank line
        System.out.println();

        //User input selection
        System.out.println("Please make a selection:");
        int number = sc.nextInt();

        //blank line
        System.out.println();

        //menu list using switch, and if-else statements
        switch(number) {
            case 1: System.out.println("The length of the phrase is " + phrase.length()); //length of phrase
            break;
            case 2: System.out.println("Enter a number between 0 and 13:"); //performs charAt
                    int numChar = sc.nextInt(); //stores user input

                    //blank line
                    System.out.println();

                    System.out.println("The character at index " + numChar + " is " + "'" + phrase.charAt(numChar) +"'");
            break;
            case 3: System.out.println("Enter a phrase that will be compared with " + "\"" + phrase + "\":"); //performs equal
                    sc.nextLine();
                    String equivalent = sc.nextLine();

                    //blank line
                    System.out.println();

                    if (phrase.equals(equivalent)){
                        System.out.println("The two phrases DO have the same sequence of characters.");
                    } else {
                        System.out.println("The two phrases DO NOT have the same sequence of characters.");
                    }
            break;
            case 4: System.out.println("Enter a phrase that will be compared with " + "\"" + phrase + "\":"); //Perform compareTo
                    sc.nextLine();
                    String comparison = sc.nextLine();

                    //blank line
                    System.out.println();

                    if (comparison.compareTo(phrase) == 0){
                        System.out.println("The two phrases are equivalent.");
                    } else if (comparison.compareTo(phrase) < 0){
                        System.out.println("Alphabetically, \"" + phrase + "\"" + " comes after " + "\"" + comparison + "\"");
                    } else {
                        System.out.println("Alphabetically, \"" + phrase + "\"" + " comes before " + "\"" + comparison + "\"");
                    }
            break;
            case 5: System.out.println("Enter a String to search " + "\"" + phrase + "\"" + " for:"); //Perform indexOf
                    sc.nextLine();
                    String search = sc.nextLine();
    
                    //blank line
                    System.out.println();
    
                    if (phrase.contains(search)) {
                        System.out.println("The first occurrence of \"" + search + "\" is at index "
                                + phrase.indexOf(search));
                    } else {
                        System.out.println("\"" + search + "\"" + " is not in the phrase " + "\"" + phrase + "\"");
                    }
            break;
            case 6: System.out.println("Choose one of the methods:"); //Perform substring
                    System.out.println("1. Create a substring from a selected index until the end");
                    System.out.println("2. Create a substring from a selected index until another selected index");

                    //blank line
                    System.out.println();

                    System.out.println("Enter selection:");
                    sc.nextLine();
                    int choice1 = sc.nextInt();

                    //blank line
                    System.out.println();

                    var x = "Which index (between " + phrase.indexOf(phrase) + " and " + (phrase.length() - 1)
                            + ") would you like to start with?";
                    if (choice1 == 1) {
                        System.out.println(x);
                        int start = sc.nextInt();

                        //blank line
                        System.out.println();

                        System.out.println("The new phrase is: " + "\"" + phrase.substring(start) + "\"");
                    } else {
                        System.out.println(x);
                        
                        int startChoice1 = sc.nextInt();
    
                        //blank line
                        System.out.println();

                        System.out.println("Which index (between " + startChoice1 + " and " + (phrase.length()-1)
                                + ") would you like to end with?");
                        int endChoice1 = sc.nextInt();

                        //blank line
                        System.out.println();

                        System.out.println("The new phrase is: " + "\"" + phrase.substring(startChoice1, endChoice1)
                                + "\"");
                    }
            break;
            case 7: System.out.println("All lowercase looks like this: " + "\"" + phrase.toLowerCase() + "\""); //Perform toLowerCase
            break;
            case 8: System.out.println("All uppercase looks like this: " + "\"" + phrase.toUpperCase() + "\""); //Perform toUpperCase
            break;
            default: System.out.println("Not a valid number!"); //prints error when user inputs # out of scope
        }
        sc.close(); //scanner closing
    }
}

/*
Where did you struggle with this coding work?
case 4,5,6

What was easy?
case 1,2,3,7, and 8

What questions do you still have?
Case 4 was very difficult, what is th ebest way to approach the "abc" and the "xyz*?

*/