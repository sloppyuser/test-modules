package org.example;

import java.util.Arrays;
import java.util.HashMap;

public class TwoSum {
    public static void main(String[] args) {
        int[] nums = {1,2,3,4};
        twoSum(nums,3);
    }

    public static int[] twoSum(int[] nums, int target) {
        int[] result = new int[2];
        HashMap<Integer,Integer> map = new HashMap<>();
        for (int i=0 ; i< nums.length;i++){
            int negation = target - nums[i];
            if(map.containsKey(negation)){
                result[0]= i;
                result[1]= map.get(negation);
                break;
            }

            map.put(nums[i],i);
        }
        Arrays.sort(result);
        System.out.println(Arrays.toString(result));
        return result;
    }

}
