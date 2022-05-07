//Write a program to interchange two numbers without using a third variable.
//
//Hint: perform addition and subtraction and use the same variables to store result.
package java_besic_work;
import java.util.Scanner;
public class if_else_question2 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter the 1st num");
        int num1=input.nextInt();
        System.out.println("Enter the 2nd num");
                int num2=input.nextInt();

        System.out.println("after arranging the value will be ");
            System.out.println((num1+num2)-num1);
            System.out.println((num1+num2)-num2);
        }

    }

