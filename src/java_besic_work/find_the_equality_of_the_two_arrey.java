//Write a Java program to test the equality of two arrays.
import java.util.Scanner;
public class find_the_equality_of_the_two_arrey {
    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);
        int arr1[]=new int[10];
        int arr2[]=new int[10];
int flag=0;
        System.out.println("Enter the 1st arey element:-");
                for(int i=0;i<arr1.length;i++){

                    arr1[i]=input.nextInt();
                }
        System.out.println("Enter the 2nd arrey element:-");
        for(int i=0;i<arr2.length;i++){

            arr2[i]=input.nextInt();
        }

        // now lets match the condition now:-
   for(int i=0;i<arr1.length;i++){

       for(int j=0;j<arr2.length;j++){

           if(arr1[i]==arr2[i]){

               flag=1;
           }else{
               flag=2;
           }
       }
   }

        if(flag==1){
            System.out.println("both arreys are same");
        }else{
            System.out.println("The arres are not same");
        }
    }
}
