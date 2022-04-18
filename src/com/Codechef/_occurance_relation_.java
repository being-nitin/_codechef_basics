package com.Codechef;
import java.util.*;

public class _occurance_relation_ {
    public static int search(int[] arr, int start,int target){
        if(start==arr.length-1) {
            return 0;
        }
        else if(arr[start]!=target){
            return search(arr,start+1,target);
        }
        else if(arr[start]==target){
            return start;
        }
        return -1;
    }
    public static void main(String[] args){
        int[] arr = {1,6,4,8,7,4};
        System.out.println(search(arr,0,4));
    }

}
