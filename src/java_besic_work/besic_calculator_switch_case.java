package java_besic_work;
import java.util.Scanner;
public class besic_calculator_switch_case {

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter the numbers hear");
        int num1=input.nextInt();
        int num2=input.nextInt();

        System.out.println("Enter the operator hear");
        char ch = input.next().charAt(0);

        switch (ch){

            case '+':
                System.out.println("The addition of the two numbers are"+(num1+num2) );break;

            case'-':
                System.out.println("The subsraction of the two numbers are"+(num1-num2));break;
            case'*':
                System.out.println("The multiplication of the two numbers are"+(num1*num2));break;
            case'/':
                System.out.println("The divition of the two numbers are "+(num1/num2));break;
            default:
                System.out.println("Enter the valid num");
        }
    }
}
