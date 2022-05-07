import java.util.Scanner;
public class find_the_2nd_largest_element {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int arr[]=new int[6];
int temp=0;
        System.out.println("Enter the elemnets of the arrey");
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
        System.out.println("The 3rd largest element is "+arr[2]);
    }
}
