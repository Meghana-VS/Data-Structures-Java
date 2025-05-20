package com.dsa.numberstheory;

//https://www.geeksforgeeks.org/problems/sum-of-all-prime-numbers-between-1-and-n4404/1
public class SumOfAllPrimeNumbersBetween_1_and_N {
    public static void main(String[] args) {
        int n = 5;
        System.out.println(prime_Sum(n));
    }
    public static int prime_Sum(int n) {
        int sum = 0;
        for(int i=2; i<=n; i++){
            if(isPrime(i)){
                sum += i;
            }
        }
        return sum;
    }
    public static boolean isPrime(int n){
        for(int i=2; i<=Math.sqrt(n); i++){
            if(n % i == 0) return false;
        }
        return true;
    }
}
