package org.example;

import java.util.*;

public class ReverseVowelsOfAString {
    public static void main(String[] args) {
        String s = "leetcode";
        System.out.println(reverseVowels(s));
    }

    static String reverseVowels(String s) {
        HashSet<Character> vowels = new HashSet<Character>() {{
            add('a'); add('e'); add('o'); add('u'); add('i');
            add('A'); add('E'); add('O'); add('U'); add('I');
        }};
        int start = 0 , end = s.length()-1;
        char[] result = s.toCharArray();
        while(start<end){
            if(vowels.contains(result[start])){
                while(start<end){
                    if(vowels.contains(result[end])){
                        char temp =  result[end];
                        result[end] = result[start];
                        result[start] =  temp;
                        end--;
                        break;
                    }
                    end--;
                }
            }
            start++;
        }
        return new String(result);
    }
}
