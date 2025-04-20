package org.example;

import java.util.ArrayList;
import java.util.List;

public class KidsWithTheGreatestNumberOfCandies {

    public static void main(String[] args) {
        int[] candies = {12,1,12};
        int extraCandies = 10;
        System.out.println(kidsWithCandies(candies,extraCandies));
    }
    /*
    * need to figure out a way to check if candies[i]+extraCandies is greatest value in candies array
    * */
    static List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int max = 0;
        for(int candyCount:candies)
            max =  candyCount>max? candyCount: max;
        List<Boolean> result = new ArrayList<>();
        for(int count : candies){
            result.add((count+extraCandies) >= max);
        }

        return result;
    }
}
