package com.dsa.numberstheory;

// https://www.geeksforgeeks.org/problems/reversing-the-equation2205/1
public class ReversingEquation {
    public static void main(String[] args) {
        String s = "20-3+5*2";
        System.out.println(reverseEqn(s));
    }
    static String reverseEqn(String S) {
//        String[] str = S.split("(?=[-+*/])|(?<=[-+*/])");
        String[] str = S.split("(?=[-+*/])|(?<=[-+*/])");
        StringBuilder reverse = new StringBuilder();
        for(int i= str.length-1; i>=0; i--){
            reverse.append(str[i]);
        }
        return reverse.toString();
    }
}
