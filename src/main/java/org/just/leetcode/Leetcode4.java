package org.just.leetcode;

import java.util.Arrays;
import java.util.Date;
import java.util.Random;

public class Leetcode4 {

    /*

Given two sorted arrays nums1 and nums2 of size m and n respectively, return the median of the two sorted arrays.
The overall run time complexity should be O(log (m+n)).


Example 1:
Input: nums1 = [1,3], nums2 = [2]
Output: 2.00000
Explanation: merged array = [1,2,3] and median is 2.

Example 2:
Input: nums1 = [1,2], nums2 = [3,4]
Output: 2.50000
Explanation: merged array = [1,2,3,4] and median is (2 + 3) / 2 = 2.5.


Constraints:

nums1.length == m
nums2.length == n
0 <= m <= 1000
0 <= n <= 1000
1 <= m + n <= 2000
-10^6 <= nums1[i], nums2[i] <= 10^6
    */

    public static void main(String[] args) {
        Leetcode4 solution = new Leetcode4();
        long startDate = new Date().getTime();
        int[] nums1 = new int[]{1, 3};
        int[] nums2 = new int[]{2};
        System.out.println("nums1: " + Arrays.toString(nums1) + ", nums2: " + Arrays.toString(nums2));
        System.out.println(solution.findMedianSortedArrays(nums1, nums2) + " milliseconds:" + (new Date().getTime() - startDate));
        System.out.println("-----");
        // Output: 2.00000
        startDate = new Date().getTime();
        int[] nums12 = new int[]{1, 2};
        int[] nums22 = new int[]{3, 4};
        System.out.println("nums1: " + Arrays.toString(nums12) + ", nums2: " + Arrays.toString(nums22));
        System.out.println(solution.findMedianSortedArrays(nums12, nums22) + " milliseconds:" + (new Date().getTime() - startDate));
        System.out.println("-----");
        // Output: 2.50000
        startDate = new Date().getTime();
        int[] nums13 = new int[1000];
        int[] nums23 = new int[1000];
        Random rand = new Random();
        for (int i = 0; i < 1000; i++) {
            nums13[i] = -1000000 + i;
            nums23[i] = 1000 + i;
        }
        System.out.println("nums1: " + Arrays.toString(nums13) + ", nums2: " + Arrays.toString(nums23));
        System.out.println(solution.findMedianSortedArrays(nums13, nums23) + " milliseconds:" + (new Date().getTime() - startDate));
        System.out.println("-----");
        // Output: 2.50000
    }

    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        double result = 0;
        int[] merged = new int[nums1.length + nums2.length];
        int i, j = 0, k = 0;
        for (i = 0; i < nums1.length || j < nums2.length ; ) {
            if (i < nums1.length && j < nums2.length) {
                if (nums1[i] > nums2[j]) {
                    merged[k++] = nums2[j++];
                } else {
                    merged[k++] = nums1[i++];
                }
            } else {
                if (i == nums1.length) {
                    merged[k++] = nums2[j++];
                }
                if (j == nums2.length && i < nums1.length) {
                    merged[k++] = nums1[i++];
                }
            }
        }
        if (merged.length % 2 == 0) {
            result = (merged[merged.length / 2] + merged[merged.length / 2 - 1]) / 2.0;
        } else {
            result = merged[merged.length / 2];
        }
        return result;
    }
}