import java.util.Arrays;
import java.util.Scanner;

public class SelectionSort {

    public static int[] selectionSort(int[] arr){

        for(int i=0; i<arr.length-1; i++){
            int min_idx = i;
            for(int j=i+1; j<arr.length; j++){
                if(arr[j]<arr[min_idx]){
                    min_idx = j;
                }
            }
            if(i!=min_idx){
                int temp = arr[min_idx];
                arr[min_idx] = arr[i];
                arr[i] = temp; 
            }

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
        
        int[] sortedArr = selectionSort(arr);
        System.out.println("Sorted Array: " + Arrays.toString(sortedArr));
    }
    
}
