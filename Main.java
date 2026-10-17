import java.util.*;


public class Main{

    public static int find(int[] inputs, int x){
        for(int i=0; i<5; i++){
            if (inputs[i] == x)
                return i;
        }
        return -1;
    }
    public static void main(String [] args){
        
        Scanner sc = new Scanner(System.in);

        
        int [] inputs = new int[5];

        for(int i=0; i<5; i++){
            System.out.print("Enter " + (i+1) + " Number: ");
            inputs[i] = sc.nextInt();

        }

        System.out.print("Enter the number you wanna find: ");
        int x = sc.nextInt();

        System.out.print(find(inputs, x));
    }
}