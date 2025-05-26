package com.dsa.searchingAndSorting.searching;

import java.util.Arrays;

public class AggressiveCows {
    public static void main(String[] args) {
        int[] a ={1, 2, 4, 8, 9};
        int k = 3;
        System.out.println(aggressiveCows(a, k));
    }
    public static int aggressiveCows(int[] stalls, int k) {
        int n = stalls.length;
        Arrays.sort(stalls);
    //*********************** BRUTE FORCE - O(NlogN) + O(N * (max(stalls[])-min(stalls[]))) *****************************
//        int limit = stalls[n-1] - stalls[0];
//        for(int i=1; i<=limit; i++){
//            if(canPlaceCows(stalls, i, k) == false) return i-1;
//        }
//        return limit;

    //*********************** Optimal -  O(NlogN) + O(N * log(max(stalls[])-min(stalls[]))) *****************************
        int start = 1, end = stalls[n-1] - stalls[0];
        int result = 0;
        while(start <= end){
            int mid = (start + end) / 2;
            if (canPlaceCows(stalls, mid, k) == true) {
                result = mid;
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return result;
    }

    private static boolean canPlaceCows(int[] stalls, int dist, int k) {
        int countCows = 1;   //first cow is placed at the first stall
        int lastPosition = stalls[0];
        for(int i=1; i<stalls.length; i++){
            if(stalls[i] - lastPosition >= dist){
                countCows++;
                lastPosition = stalls[i];
                if(countCows >= k) return true;
            }
        }
        return false;
    }
}
