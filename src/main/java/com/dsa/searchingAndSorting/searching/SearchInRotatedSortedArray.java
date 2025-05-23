package com.dsa.searchingAndSorting.searching;

// https://leetcode.com/problems/search-in-rotated-sorted-array/description/
public class SearchInRotatedSortedArray {
    public static void main(String[] args) {
        int[] a = {4,5,6,7,0,1,2};
        int target = 0;
        System.out.println(search(a, target));
    }
    public static int search(int[] nums, int target) {
    //**************** Brute Force Approach ******************
//        for(int i=0; i<nums.length; i++){
//            if(nums[i] == target) return i;
//        }
//        return -1;
    //**************** Optimal Approach ******************
        int n = nums.length;
        int start = 0;
        int end = n-1;
        while(start <= end){
            int mid = start + (end-start)/2;
            if(target == nums[mid]) return mid;
            //find the sorted half
            if(nums[start] <= nums[mid]){               //left half is sorted
                if(nums[start] <= target && target <= nums[mid]) end = mid - 1; //target is in sorted half
                else start = mid + 1;
            }else {                                     //right half of the array is sorted
                if(nums[mid] <= target && target <= nums[end]) start = mid + 1;
                else end = mid - 1;
            }
        }
        return -1;
    }
}
