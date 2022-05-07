// take an arrey and  cheak that the elemnt is same as the mid elemet of the arrey using the binary search:_
import java.util.Scanner;
public class binary_search_question1 {

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int arr[]=new int[20];
        int li=0;
        int hi=arr.length-1;
        int mid=(li+hi)/2;

        System.out.println("Enter the elemnts of the arrey:");
        for(int i=0;i<arr.length;i++){
            arr[i]=input.nextInt();
        }

        System.out.println("Enter the element hear");
        int element=input.nextInt();

        if(element==arr[mid]){

                System.out.println("The elemnt is present in the  middile section" );
            }else {
            System.out.println("Not present in the middle section");
        }






    }
}
