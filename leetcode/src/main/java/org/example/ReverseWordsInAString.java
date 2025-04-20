package org.example;

import java.util.Arrays;
import java.util.List;

public class ReverseWordsInAString {
    public static void main(String[] args) {
        String s = "a good   example";
        System.out.println(approach2(s));
    }

    static String approach1(String s) {
        List<String> list = Arrays.stream(s.replaceAll("\\s+"," ").trim().split(" ")).toList();
        StringBuilder sb =  new StringBuilder();
        for(int i=list.size()-1;i>=0;i--){
            sb.append(list.get(i));
            if(i>0)
            sb.append(" ");
        }
        return sb.toString().trim();
    }

    static String approach2(String s){
        char[] in = s.toCharArray();
        char[] out = new char[in.length + 1];
        int right = in.length - 1;
        int ind = 0;

        while (right >= 0){
            while (right >= 0 && in[right] == ' ') {
                right--;
            }
            if (right < 0)
                break;
            int rightWordIndex = right;
            while (right >= 0 && in[right] != ' ') {
                    right--;
            }
            for (int k = right + 1; k <= rightWordIndex; k++ ) {
                out[ind++] = in[k];
            }
                out[ind++] = ' ';
        }
        String result =  new String(out, 0, ind - 1);
        return result;
    }
}
