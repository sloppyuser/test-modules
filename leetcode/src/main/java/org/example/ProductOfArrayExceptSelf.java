package org.example;

import java.util.Arrays;

public class ProductOfArrayExceptSelf {
    public static void main(String[] args) {
        int[] nums={-1,1,0,-3,3};
        System.out.println(Arrays.toString(approach3(nums)));
    }

    /*approach uses dividing method*/
    static int[] approach1(int[] nums) {
        int n = nums.length;
        int ans[] = new int[n];
        int pro = 1;
        for(int i : nums) {
            pro *= i;
        }

        for(int i = 0; i < n; i++) {
            ans[i] = pro / nums[i];
        }
        return ans;
    }

    static int[] approach2(int[] nums){
        int n = nums.length;
        int pre[] = new int[n];
        int suff[] = new int[n];
        pre[0] = 1;
        suff[n - 1] = 1;

        for(int i = 1; i < n; i++) {
            pre[i] = pre[i - 1] * nums[i - 1];
        }
        for(int i = n - 2; i >= 0; i--) {
            suff[i] = suff[i + 1] * nums[i + 1];
        }

        int ans[] = new int[n];
        for(int i = 0; i < n; i++) {
            ans[i] = pre[i] * suff[i];
        }
        return ans;
    }

    static int[] approach3(int[] nums){
        int n = nums.length;
        int ans[] = new int[n];
        Arrays.fill(ans,1);
        int product = 1;
        for(int i = 0; i < n; i++) {
            ans[i] *= product;
            product *= nums[i];
        }
        product = 1;
        for(int i = n - 1; i >= 0; i--) {
            ans[i] *= product;
            product *= nums[i];
        }
        return ans;
    }
}
