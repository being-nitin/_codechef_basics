package com.Codechef;
import java.util.*;

public class _codechef_positive_product_problem_ {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            long pos=0,neg=0;
            int n = sc.nextInt();
            int[] arr = new int[n];
            for (int i=0;i<n;i++){
                arr[i]= sc.nextInt();
                if(arr[i]==0){
                    continue;
                }
                else if(arr[i]>0){
                    pos++;
                }
                else{
                    neg++;
                }
            }
            long sum1 = pos*(pos-1);
            long sum2 = neg*(neg-1);
            long sum = sum1/2 + sum2/2;
            System.out.println(sum);
        }
    }
}
