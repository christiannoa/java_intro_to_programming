/*
Christian Noa
3/19/23
a program to ask the user how many apples they are buying, and then output the total cost of the apples.
1 apple purchased: each apple costs $1.99
Between 2 and 4 apples purchased (inclusive): each apple costs $1.49
More than 4 apples purchased: each apple costs $0.99
*/
import java.util.Scanner;
public class Apples {
    public static void main(String[] args){
        totalCost(); //Gets the sum of the total cost of apples
    }

    //this method performs conditional statements (if, else-if, else).
    public static void totalCost(){
        //Scanner to read in input from user
        Scanner insert = new Scanner(System.in);

        //User inputs total number of apples they are buying
        System.out.println("How many apples are you buying?");
        int total = insert.nextInt();

        // declaring a variable (double since it hold decimals)
        double one = 1.99;
        double twoFour = 1.49 * total;
        double fivePlus = 0.99 * total;

        //conditional statements (if, else-if, else) based on the number of apples user is buying.
        if (total == 1) {
            System.out.println("The total cost of the apples is $" + one);
        } else if (total <= 4){
            System.out.println("The total cost of the apples is $" + twoFour);
        } else {
            System.out.println("The total cost of the apples is $" + fivePlus);
        }

        insert.close();
    }
}

/*
Where did you struggle with this coding work?
I struggled with finding the total cost of 2+

What was easy?
finding the total of 1

What questions do you still have?
No questions.

*/