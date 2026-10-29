import java.util.Arrays;
import java.util.Scanner;

public class InsertionSort {

    public static int[] insertionSort(int[] arr){

        for(int i=1; i<arr.length; i++){
            int j=i-1;
            int val = arr[i];
            while(j>=0 && arr[j]>val){
                //Shifting
                arr[j+1] = arr[j];
                j--;
            }
            arr[j+1] = val;
        }        
        return arr;
    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of element in Array: ");
        int n = sc.nextInt();
        System.out.println();

        int[] arr = new int[n];

        for(int i=0; i<n; i++){
            System.out.print("Enter " + (i+1) + " : ");
            arr[i] = sc.nextInt();
            System.out.println();
        }
        sc.close();
        
        int[] sortedArr = insertionSort(arr);
        System.out.println("Sorted Array: " + Arrays.toString(sortedArr));
    }
    
}
