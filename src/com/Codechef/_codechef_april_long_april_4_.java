package com.Codechef;
import java.util.*;

public class _codechef_april_long_april_4_ {
    public static void main(String[] args) {
        /*
           Dazzling GCD Pair Problem Code: NOTUNIT

           Dazzler has a task for you.
           Given two positive integers A and B, find two positive integers i and j such that:

           gcd(i,j)>1;
           A≤i<j≤B;
           The value (i+j) is minimum possible.
           If there are multiple solutions, you may print any of them. If no such pair exists, print −1.

           Input Format
           First line will contain T, number of test cases. Then the test cases follow.
           Each test case contains of a single line of input, two integers A and B.

           Output Format
           For each test case, output in a single line two space-separated integers i and j
           satisfying all the conditions. If no such pair exists, print −1.

           Constraints
           1≤T≤105
           1≤A<B≤109

           Sample Input 1
           2
           2 3
           2 10
           Sample Output 1
           -1
            2 4
         */
    try{
            Scanner sc=new Scanner(System.in);
            int t=sc.nextInt();
            while(t-->0){
                int start=sc.nextInt();
                int end=sc.nextInt();
                if(end-start==2 && start%2==0)
                    System.out.println(start+" "+end);
                else if(end-start>2){
                    if(start%2==0)
                        System.out.println(start+" "+(start+2));
                    else if(start%3==0)
                        System.out.println(start+" "+(start+3));
                    else
                        System.out.println((start+1)+" "+(start+3));
                }
                else
                    System.out.println("-1");
            }
        }catch(Exception e){
            return;
        }

    }

}

