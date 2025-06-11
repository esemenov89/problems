package org.just.leetcode.leetcode2956;

public class Solution {

    public int[] findIntersectionValues(int[] nums1, int[] nums2) {
        int[] result = new int[2];
        for (int k : nums1) {
            for (int i : nums2) {
                if (k == i) {
                    result[0]++;
                    break;
                }
            }
        }
        for (int k : nums2) {
            for (int i : nums1) {
                if (k == i) {
                    result[1]++;
                    break;
                }
            }
        }

        return result;
    }
}