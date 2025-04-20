package org.example;

import java.util.HashMap;
import java.util.Map;

public class PermutationOfStringAInStringB {
    public static void main(String[] args) {
        String a="abc";
        String b="abd";
        //System.out.println(getPermutations(a,b));
        System.out.println(isPermutationApproach2(a,b));
    }

    public static int getPermutations(String a,String b){
        int count=0;
        Map<Character, Integer> mapS = new HashMap();
        Map<Character, Integer> mapT = new HashMap();
        char[] arrS = a.toCharArray();
        char[] arrT = b.toCharArray();
        if (a.length() > b.length()) {
            return 0;
        } else {
            for (int i = 0; i < a.length(); i++) {
                mapS.put(arrS[i], mapS.get(arrS[i]) == null ? 1
                        : mapS.get(arrS[i]) + 1);
                mapT.put(arrT[i], mapT.get(arrT[i]) == null ? 1
                        : mapT.get(arrT[i]) + 1);
            }

            for (char key : mapS.keySet()) {
                if (!mapS.get(key).equals(mapT.get(key))) {
                    System.out.println(key);
                    System.out.println(mapS.get(key) + " vs "+ mapT.get(key));
                    return count;
                }
            }
        }
        return count;
    }

    boolean isPermutationApproach1(String a, String b){
        if(a.length() != b.length()){
            return false;
        }
        return sort(a).equals(sort(b));
    }

    String sort(String s){
        char[] content = s.toCharArray();
        java.util.Arrays.sort(content);
        return  new String(content);
    }

    static boolean isPermutationApproach2(String a, String b){
        if(a.length() != b.length()){
            return false;
        }
        int[] letters = new int[128];
        char[] a_array = a.toCharArray();
        for(char c : a_array){
            letters[c]++;
        }
        for(int i=0; i< b.length();i++){
            int c = b.charAt(i);
            letters[c]--;
            if(letters[c]<0){
                return false;
            }
        }
        return true;
    }
}
