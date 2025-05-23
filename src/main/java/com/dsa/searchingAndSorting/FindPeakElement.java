package com.dsa.searchingAndSorting;

// https://leetcode.com/problems/find-peak-element/description/
public class FindPeakElement {
    public static void main(String[] args) {
        int[] a = {1,2,1,3,5,6,4};
        System.out.println(findPeakElement(a));
    }
    public static int findPeakElement(int[] nums) {
        int n = nums.length;
    //******************** APPROACH-1 ***************************
//        for(int i=0; i<n; i++){
//            if((i==0 || nums[i] > nums[i-1]) && (i == n-1 || nums[i] > nums[i+1])){
//                return i;
//            }
//        }
//        return -1;
    //******************** APPROACH-2 ***************************
        // Edge cases:
        if(n==1) return 0;
        if(nums[0] > nums[1]) return 0;
        if(nums[n-1] > nums[n-2]) return n-1;
        int start = 1, end = n-2;
        while(start <= end){
            int mid = start + (end - start) / 2;
            // If arr[mid] is the peak:
            if(nums[mid] > nums[mid-1] && nums[mid] > nums[mid+1]) return mid;
            // If we are in the left half:
            else if(nums[mid] > nums[mid-1]) start = mid + 1;
            // If we are in the right half:
            else end = mid - 1;
        }
        return -1;
    }
}
