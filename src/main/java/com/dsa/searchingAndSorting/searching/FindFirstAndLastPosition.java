package com.dsa.searchingAndSorting.searching;

import java.util.Arrays;

// https://leetcode.com/problems/find-first-and-last-position-of-element-in-sorted-array/description/
public class FindFirstAndLastPosition {
    public static void main(String[] args) {
        int[] nums = {5,7,7,8,8,10};
        int target = 8;
        int[] ans = searchRange(nums, target);
        System.out.println(Arrays.toString(ans));
    }
    public static int[] searchRange(int[] nums, int target) {
        int first = findFirst(nums, target);
        int last = findLast(nums, target);
        return new int[]{first, last};
    }
    static int findFirst(int[] nums, int target){
        int n = nums.length;
        int start = 0;
        int end = n-1;
        int first = -1;
        while(start <= end){
            int mid = start + (end - start) / 2;
            if(nums[mid] == target) {
                first = mid;
                end = mid - 1;
            }
            else if(target < nums[mid]){
                end = mid - 1;
            }else{
                start = mid + 1;
            }
        }
        return first;
    }
    static int findLast(int[] nums, int target){
        int n = nums.length;
        int start = 0;
        int end = n-1;
        int last = -1;
        while(start <= end){
            int mid = start + (end-start)/2;
            if(target == nums[mid]){
                last = mid;
                start = mid + 1;
            }else if(target > nums[mid]){
                start = mid + 1;
            }else {
                end = mid - 1;
            }
        }
        return last;
    }
}
