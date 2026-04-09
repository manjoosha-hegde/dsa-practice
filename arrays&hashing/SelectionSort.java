import java.util.*;

public class SelectionSort {
    public static void main(String [] args){
        System.out.println("Selection Sort");
        System.out.println("Enter the number of elements in the Array: ");
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println("Enter the elements of the Array: ");
        int arr[] = new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("The elements of the Array are: ");
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+ "  ");
        }
        System.out.println();
        System.out.println("The sorted elements of the Array are: ");
        selection_sort(arr,n);
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+ "  ");
        }
        sc.close();
    }

    public static void selection_sort(int arr [],int n){
        for(int i=0;i<=n-2;i++){
            int minIndex=i;
            for(int j=i+1;j<=n-1;j++){
                if(arr[j]<arr[minIndex]){
                    minIndex=j;
                }
            }
            int temp=arr[minIndex];
            arr[minIndex]=arr[i];
            arr[i]=temp;
        }
    }
}