package java_besic_work;
import java.util.Scanner;
public class besic1 {
    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);


        System.out.println("Enter the num hear" );
        int num=input.nextInt();
        if(num%2==0){
            System.out.println("NUmber is even");
        }else{
            System.out.println("The num is odd");
        }
    }
}
