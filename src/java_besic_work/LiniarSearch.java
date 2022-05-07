//marge two arrys in java and  search an element bye the index num of the arrey;-
import java.util.Scanner;
public class LiniarSearch {
    public static void main(String[] args) {

        int arr1[]=new int[6];
        int arr2[]=new int[6];
        int element=0;
        Scanner input=new Scanner(System.in);
        System.out.println("Enter the elemnts of the 1st arrey:");
        for(int i=0;i<arr1.length;i++){

            arr1[i]=input.nextInt();
        }
        System.out.println("Enter the elemnts of the 2nd arrey:");
        for(int i=0;i<arr2.length;i++){

            arr2[i]=input.nextInt();
        }
        // now lets take the elemnt to search;-
        System.out.println("Enter the elemnt to search");
        element=input.nextInt();

        System.out.println("The element is in the index of ");
        for(int i=0;i<arr1.length+arr2.length-1;i++){

            if(element==arr1[i]||element==arr2[i]){

                System.out.println(i);
            }
        }


    }

}
