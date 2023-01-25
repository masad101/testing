/* Author         :  Mohamed Asad Bandarkar
   Program Name   :  cos101_4271451tut2
   Purpose        :  This is a program that reads integers and checks if the student has passed.
   Student Number: 4271451
*/

import java.util.Scanner;
import java.util.*;
public class Main {

    public static void main(String[] args)
    {
        final int PASSES = 50;

        Scanner in = new Scanner(System.in);
        int str1 = 0;
        boolean FINISHED = false;
        do{
            System.out.println("Enter student mark between 0 - 100%: ");
            System.out.println("When completed type in 0.");
            str1 = in.nextInt();

            int input = 0;

            input = Integer.parseInt(String.valueOf(str1));

            if(input == 0){
                System.out.println("Thank you...Good Bye");
                FINISHED = false;
            }else if (input >= PASSES) {
                System.out.println("Student Passed");
            } else {
                System.out.println("Student Failed");
            }
        }while(FINISHED);
    }
}