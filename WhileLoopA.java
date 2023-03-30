/*
Christian Noa
3/22/23
a program that uses a while loop that has an output of 0-9
*/

import java.util.Scanner;
public class WhileLoopA {
    public static void main(String[] args){
        loop(); // calling the while loop here in the main method
    }

    //this is where the while loop is set-up to increment by 1
    public static void loop(){
        //Print Start to begin
        System.out.println("BEGIN"); //Prints "begin" when loop starts

        //declaring my variable at 0 and counts up
        int count = 0;

        //while loop setup until it reaches 10
        while(count != 10) {
            System.out.println(count);
            count++; //increments by 1
        }
        System.out.println("END"); //Prints "end" when loop reaches 9
    }
}





/*
Where did you struggle with this coding work?
I struggled a bit with setting up the while loop. I did not use the != operator

What was easy?
setting up my


What questions do you still have?
No questions


*/