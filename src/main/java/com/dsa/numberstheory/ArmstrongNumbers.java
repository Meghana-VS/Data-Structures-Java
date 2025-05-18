package com.dsa.numberstheory;

// https://www.geeksforgeeks.org/problems/armstrong-numbers2727/1
public class ArmstrongNumbers {
    public static void main(String[] args) {
        int n = 153;
        System.out.println(armstrongNumber(n));
    }
    static boolean armstrongNumber(int n) {
        int temp = n;
        int sum = 0;
//        while(n > 0){
//            int rem = n % 10;
//            n /= 10;
//            sum += (rem*rem*rem);
//        }
//        if(sum == temp) return true;
//        return false;

    //*********** OR *******************
    int count = String.valueOf(n).length();
        while(n > 0){
            int rem = n % 10;
            sum += Math.pow(rem, count);
            n /= 10;
        }
        return sum==temp;
    }
}
