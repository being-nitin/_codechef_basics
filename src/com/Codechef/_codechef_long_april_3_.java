package com.Codechef;
import java.util.*;

public class _codechef_long_april_3_ {
    public static void main(String[] args) {
        /*
         The Cooler Dilemma 2 Problem Code: WATERCOOLER2
         The summer is at its peak in Chefland. Chef is planning to purchase a
         water cooler to keep his room cool. He has two options available:

         Rent a cooler at the cost of X coins per month.
         Purchase a cooler for Y coins.
         Chef wonders what is the maximum number of months for which he can rent the cooler
         such that the cost of renting is strictly less than the cost of purchasing it.

         Input Format
         The first line of input will contain an integer T — the number of test cases.
         The description of T test cases follows.

         The first and only line of each test case contains two integers X and Y, as described
         in the problem statement.

         Output Format
         For each test case, output the maximum number of months for which he can rent the cooler
         such that the cost of renting is strictly less than the cost of purchasing it.

         If Chef should not rent a cooler at all, output 0.

         Constraints
         1≤T≤1000
         1≤X,Y≤109

         Sample Input 1
         2
         5 12
         5 5
         Sample Output 1
         2
         0
         */
    Scanner sc = new Scanner(System.in);
    int t = sc.nextInt();
    while(t-->0){
        int x = sc.nextInt();
        int y = sc.nextInt();
        int div = y/x;
        if(div*x==y){
            System.out.println(div-1);
        }
        else{
            System.out.println(div);
        }
    }

    }
}
