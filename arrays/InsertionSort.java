import java.util.Scanner;

public class InsertionSort {
    public static void main(String [] args){
        System.out.println("Insertion Sort");
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
        insertion_sort(arr,n);
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+ "  ");
        }
        sc.close();
    }

    public static void insertion_sort(int arr[],int n){
        for(int i=0;i<=n-1;i++){
            int j=i;
            while(j>0 && arr[j-1]>arr[j]){
                int temp=arr[j-1];
                arr[j-1]=arr[j];
                arr[j]=temp;
                j--;
            }
        }
    }
}
