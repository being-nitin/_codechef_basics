package com.Codechef;
import java.util.*;

public class _Digit_sum_perities_ {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0) {
            int n = sc.nextInt();
            int x = n;
            for (int i = 0; i < n; i++) {
                if (parity(x) % 2 != 0) {
                    if(x>n)
                        System.out.println(x);
                        break;
                }
                x = x+1;
            }
        }
    }
    public static int parity(int n){
        int x = n;
        int rem = 0,rev = 0,sum =0;
        while(x!=0){
            rem = x%10;
            sum = sum + rem;
            x = x/10;
        }
        return sum;
    }
}