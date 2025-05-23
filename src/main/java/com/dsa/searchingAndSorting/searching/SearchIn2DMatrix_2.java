package com.dsa.searchingAndSorting.searching;

import java.util.Arrays;

public class SearchIn2DMatrix_2 {
    public static void main(String[] args) {
        int[][] a = {
                {1, 2, 3, 4},
                {4, 5, 6, 7},
                {7, 8, 9, 10}
        };
        int target = 8;
        int[] ans = searchIn2D(a,target);
        System.out.println(Arrays.toString(ans));
    }
    public static int[] searchIn2D(int[][] a, int target){
        int n = a.length;
        for(int i=0; i<n; i++){
            for(int j=0; j<a[i].length; j++){
                if(a[i][j] == target){
                    return new int[]{i,j};
                }
            }
        }
        return new int[]{-1, -1};
    }
}
