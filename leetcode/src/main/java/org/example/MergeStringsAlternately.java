package org.example;

public class MergeStringsAlternately {
    public static void main(String[] args) {
        String word1 = "abcd";
        String word2 = "pqrstuv";
        System.out.println(solution(word1,word2));
    }

    static String solution(String word1, String word2){
        StringBuffer sb = new StringBuffer();

        for(int i=0; i<(word1.length()<word2.length()?word2.length():word1.length());i++ ){
            if(i<word1.length()){
                sb.append(word1.charAt(i));
            }

            if(i<word2.length()){
                sb.append(word2.charAt(i));
            }
        }
        return sb.toString();
    }
}
