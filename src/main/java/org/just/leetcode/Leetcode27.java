package org.just.leetcode;

import java.util.Arrays;

public class Leetcode27 {

    public static void main(String[] args) {
        Leetcode27 leetcode = new Leetcode27();
        //int[] nums = new int[]{1, 1, 2};
        int[] nums = new int[]{0,1,2,2,3,0,4,2};
        int k = 2;
        int n = leetcode.removeElement(nums, k);
        System.out.print(n + ", nums = [");
        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i]);
            if (i != nums.length - 1) {
                System.out.print(",");
            }
        }
        System.out.print("]");
    }

/*    Input: nums = [3,2,2,3], val = 3
    Output: 2, nums = [2,2,_,_]*/

/*
    Input: nums = [0,1,2,2,3,0,4,2], val = 2
    Output: 5, nums = [0,1,4,0,3,_,_,_]
*/

    public int removeElement(int[] nums, int val) {
        int result = 0;
        int[] resultArray = new int[nums.length];
        int j = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                resultArray[j++] = nums[i];
            }
        }
        for (int i = 0; i < resultArray.length; i++) {
            nums[i] = resultArray[i];
        }
        Arrays.sort(nums, 0, j);
        result = j;
        return result;
    }
}