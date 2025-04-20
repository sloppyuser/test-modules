package org.example;

public class IncreasingTripletSubsequence {
    public static void main(String[] args) {
        int[] nums={5,2,5,4,5};
        //int[] nums={2,1,5,0,4};
        System.out.println(approach1(nums));
    }
    static boolean approach1(int[] nums) {

        if(nums.length < 3)
            return false;
        int min1 = Integer.MAX_VALUE;
        int max2 = Integer.MAX_VALUE;

        for (int num : nums) {
            if(num <= min1) {
                min1 = num;
            }else if(num <= max2)
                max2 = num;
            else return true;
        }
        return false;
    }
}

