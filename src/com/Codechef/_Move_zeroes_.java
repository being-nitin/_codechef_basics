package com.Codechef;
import java.util.*;

public class _Move_zeroes_ {


    public static void zeroes(int[] nums){
        int start=0,end = nums.length;
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=0){
                nums[start] = nums[i];
                start++;
            }
        }
        while(start<end){
            nums[start] = 0;
            start++;
        }

    }

    public static void main(String[] args) {
        int[] nums = {0,1,0,12,4};
        zeroes(nums);
        System.out.println(Arrays.toString(nums));
    }
}
