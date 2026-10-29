import java.util.Arrays;
import java.util.Scanner;


//Time complexicity: worst case: O(n^2)
// Best case: O(n)
//inplace and stable
public class BubbleSort {

    public static int[] bubbleSort(int[] arr){

        int n = arr.length;
        for(int i=0; i<n-1; i++){

            boolean swapped = false;
            //n-1-i because each loop makes last element in corrent place   
            for(int j=0; j<n-1-i; j++){
                if(arr[j]>arr[j+1]){
                    swapped = true;
                    //Swap
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
            if (!swapped){
                return arr;
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
        
        int[] sortedArr = bubbleSort(arr);
        System.out.println("Sorted Array: " + Arrays.toString(sortedArr));
    }
    
}
