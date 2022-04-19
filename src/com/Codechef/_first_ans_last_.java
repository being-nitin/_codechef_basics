package com.Codechef;
import java.util.*;
public class _first_ans_last_ {
    public static int[] firstLast(int[] arr, int first,int last,int target){
        if(first==arr.length-1){
            return new int[]{-1,-1};
        }
        else if(arr[first]!=target){
            return firstLast(arr,first+1,last,target);
        }
        else if(arr[last]!=target){
            return firstLast(arr,first,last-1,target);
        }
        else{
            return new int[]{first,last};
        }
    }

    public static void main(String[] args) {
        int[] arr = {10,20,30,20,40};
        int[] ans = firstLast(arr,0,arr.length-1,20);
        System.out.println(Arrays.toString(ans));
    }
}
