package com.Codechef;
import java.util.*;

public class _codechef_long_april_ {
    public static void main(String[] args) {
        /*
          Ezio and Guards Problem Code: MANIPULATE
          Ezio can manipulate at most X number of guards with the apple of eden.

          Given that there are Y number of guards, predict if he can safely manipulate all of them.

          Input Format
          First line will contain T, number of test cases. Then the test cases follow.
          Each test case contains of a single line of input, two integers X and Y.

          Output Format
          For each test case, print YES if it is possible for Ezio to manipulate all the guards.
          Otherwise, print NO.

          You may print each character of the string in uppercase or lowercase (for example, the strings
          YeS, yEs, yes and YES will all be treated as identical).

          Constraints
          1≤T≤100
          1≤X,Y≤100
          Sample Input 1
          3
          5 7
          6 6
          9 1
          Sample Output 1
          NO
          YES
          YES

         */
    Scanner sc = new Scanner(System.in);
    int t = sc.nextInt();
    while(t-->0){
        int x = sc.nextInt();
        int y = sc.nextInt();
        if(x<y){
            System.out.println("NO");
        }
        else if(x>=y){
            System.out.println("Yes");
        }
    }
    }
}
