import java.util.Scanner;
public class find_the_2nd_smallest_element {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);

        int arr[]=new int[10];
        int temp=0;
        System.out.println("Enter the elements of the arrey");
        for(int i=0;i<arr.length;i++){
            arr[i]=input.nextInt();

        }
        // lets find the 2nd largest verieble
        for(int i=0;i<arr.length;i++){

            for(int j=i+1;j<arr.length;j++){
                if(arr[i]>arr[j]){
                    temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }
        System.out.println("The 2nd smallest num is "+arr[2]);
    }
}
