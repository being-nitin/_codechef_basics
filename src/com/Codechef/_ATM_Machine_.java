package com.Codechef;
import java.util.*;

public class _ATM_Machine_ {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            int target = sc.nextInt();
            int[] arr= new int[n];
            for(int i=0;i<n;i++){
                arr[i] = sc.nextInt();
                if(arr[i]<=target){
                    target = target -arr[i];
                    System.out.print("1");
                }
                else{
                    System.out.print("0");
                }
            }
            System.out.println();
        }
    }
}
