package com.dsa.numberstheory;

// https://www.geeksforgeeks.org/problems/lcm-and-gcd4516/1
public class LCM_and_GCD {
    public static void main(String[] args) {
        int a = 8;
        int b = 12;
        int[] ans = lcmAndGcd(a,b);
        for (int x : ans){
            System.out.print(x+" ");
        }
    }
    public static int[] lcmAndGcd(int a, int b) {
        return new int[]{lcm(a,b), gcd(a,b)};
    }
    public static int gcd(int a, int b){
        if(b == 0) return a;
        while(b != 0){
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
        //Euclidean Algo (recursive approach)
//        if(b == 0) return a;
//        return gcd(b, a % b);
    }
    public static int lcm(int a, int b){
        return (a * b / gcd(a,b));
    }
}
