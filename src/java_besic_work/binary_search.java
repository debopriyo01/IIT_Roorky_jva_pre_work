import java.util.Scanner;
public class binary_search {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);

        int arr[]=new int[10];
       int i;
        int li=0;
        int hi=arr.length-1;
        int mid=(li+hi)/2;

        System.out.println("Enter the elemnts of the arrey:_");
        for( i=0;i<arr.length;i++){

            arr[i]=input.nextInt();
        }


        System.out.println("Enter the elemnt to be search:");
        int element=input.nextInt();
        // lets do the proper logic and start the search prosses:-

        while(li<=hi){

            // lets put the 1st condition:-
            if(element==arr[mid]){
                System.out.println("The elemnt is present in the index"+mid);
                break;
            }
            else if(arr[mid]<element){

                hi=mid-1;
            }else{

                li=mid+1;
            }
            mid=li+hi/2;

        }







    }
}
