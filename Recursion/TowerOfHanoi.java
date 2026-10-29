package Recursion;

import java.util.Scanner;

public class TowerOfHanoi {

    public static void tOH(int n, String src, String dist, String helper){

        if (n==1){
             System.out.println("Transfer disk "+n+" from "+src+" to "+dist);
             return;

        }

        tOH(n-1, src, helper, dist);
        System.out.println("Transfer disk "+n+" from "+src+" to "+dist);
        tOH(n-1, helper, dist, src);
    }
    
    public static void main(String [] args){
        System.out.println("Let us assume 3 tower Source(S), Destination(D) and Helper(H).");
        System.out.print("Enter the number of Disk in Source: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        tOH(n, "S", "D", "H");


    }
}
