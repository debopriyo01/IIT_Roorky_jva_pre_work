//Write a Java program to compute the average value of an array of integers except the largest and smallest values:-
import java.util.Scanner;
public class difference_exept_largest_and_smallest {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int arr[]=new int[10];


float sum=0;
int temp;
        System.out.println("Enter the elemnets of the arrey:");
        for(int i=0;i<arr.length;i++){

         arr[i]=input.nextInt();
        }

        for(int i=0;i<arr.length;i++){



            for(int j=i+1;j<arr.length;j++){

                if(arr[i]<arr[j]){

                    temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }

        System.out.println("the largest elemnt of the arrey is "+arr[0]);
        System.out.println("the smallest elemnt of the arrey is "+arr[arr.length-1]);



        for(int i=0;i<arr.length;i++){

            if(arr[i]==arr[0] || arr[i]==arr[arr.length-1]){

                continue;
            }else{

                sum+=arr[i];
            }
        }

 float avarage=(sum/8);
        System.out.println(avarage);



    }
}
