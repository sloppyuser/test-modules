package org.example;

public class StringCompression {
    public static void main(String[] args) {
        char[] chars = {'a','a','b','b','c','c','c'};
        System.out.println(approach1(chars));
    }

    static int approach1(char[] chars) {
        char arr[]=new char[chars.length];
        StringBuilder sb = new StringBuilder(chars.length);
        int count = 1;
        for(int i=0;i<chars.length;i++){
            if(sb.toString().indexOf(chars[i])>-1){
               count++;
            }else{
                if(count>1) {
                    sb.append(count);
                    count=1;
                }
                sb.append(chars[i]);

            }
        }
        System.out.println(sb.toString());
        return sb.toString().length();
    }
}
