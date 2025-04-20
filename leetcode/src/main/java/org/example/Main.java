package org.example;

import org.example.gasstation.Solution;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        Solution solution = new Solution();
        int gas[] = {1,2,3,4,5};
        int cost[] = {3,4,5,1,2};
        solution.canCompleteCircuit(gas,cost);
    }
}