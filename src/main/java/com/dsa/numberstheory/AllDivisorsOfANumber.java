package com.dsa.numberstheory;

// https://www.geeksforgeeks.org/problems/all-divisors-of-a-number/1
public class AllDivisorsOfANumber {
    public static void main(String[] args) {
        int n = 20;
        print_divisors(n);
    }
    public static void print_divisors(int n) {
        for(int i=1; i<=n; i++){
            if(n % i == 0) System.out.print(i+" ");
        }
    }
}
