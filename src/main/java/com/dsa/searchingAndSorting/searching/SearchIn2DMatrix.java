package com.dsa.searchingAndSorting.searching;

import java.util.Arrays;

// https://leetcode.com/problems/search-a-2d-matrix/description/
public class SearchIn2DMatrix {
    public static void main(String[] args) {
        int[][] a = {
                {1, 2, 3, 4},
                {4, 5, 6, 7},
                {7, 8, 9, 10}
        };
        int target = 10;
        int[] ans = searchIn2D(a,target);
        System.out.println(Arrays.toString(ans));
    }
    public static int[] searchIn2D(int[][] a, int target){
        int n = a.length;
    //******************* BRUTE FORCE - O(m x n) ************************
//        for(int i=0; i<n; i++){
//            for(int j=0; j<a[i].length; j++){
//                if(a[i][j] == target){
//                    return new int[]{i,j};
//                }
//            }
//        }
//        return new int[]{-1, -1};

    //******************* BETTER SOLUTION - O(n x log2m) ************************
//        for(int row=0; row<n; row++){
//            if(a[row][0] <= target && target <= a[row][a[row].length-1]){
//                int index = binarySearch(a[row], target);
//                if(index != -1) return new int[]{row, index};
//            }
//        }
//        return new int[]{-1, -1};
//    }
//    public static int binarySearch(int[] a, int target){
//        int n = a.length;
//        int start = 0, end = n-1;
//        while(start <= end){
//            int mid = (start+end)/2;
//            if(a[mid] == target) return mid;
//            else if(target < a[mid]) end = mid - 1;
//            else start = mid + 1;
//        }
//        return -1;
        int m = a[0].length;
        int row = 0; int col = m-1;
        while(row<n && col>=0){
            if(a[row][col] == target) return new int[]{row,col};
            else if(target > a[row][col]) row++;
            else col--;                           //if(target < a[row][col])
        }
        return new int[]{-1,-1};
    }
}
