import java.util.*;
public class BubbleSort {
    public static void main(String [] args){
        System.out.println("Bubble Sort");
        System.out.println("Enter the number of elements in the Array: ");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println("Enter the elements of the Array: ");
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("The elements of the Array are: ");
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+ "  ");
        }
        System.out.println();
        System.out.println("The sorted elements of the Array are: ");
        bubble_sort(arr,n);
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+ "  ");
        }
        sc.close();
    }

    public static void bubble_sort(int arr[],int n){
        for(int i=n-1;i>=0;i--){
            int didSwap=0;
            for(int j=0;j<=i-1;j++){
                if(arr[j]>arr[j+1]){
                    int temp=arr[j+1];
                    arr[j+1]=arr[j];
                    arr[j]=temp;
                    didSwap=1;
                }
            }
            if(didSwap==0){
                break;
            }
        }
    }
    
}
