package org.just.leetcode;

import java.util.Arrays;

public class Leetcode88 {

/*  Example 1:
    Input: nums1 = [1,2,3,0,0,0], m = 3, nums2 = [2,5,6], n = 3
    Output: [1,2,2,3,5,6]
    Explanation: The arrays we are merging are [1,2,3] and [2,5,6].
    The result of the merge is [1,2,2,3,5,6] with the underlined elements coming from nums1.

    Example 2:
    Input: nums1 = [1], m = 1, nums2 = [], n = 0
    Output: [1]
    Explanation: The arrays we are merging are [1] and [].
    The result of the merge is [1].

    Example 3:
    Input: nums1 = [0], m = 0, nums2 = [1], n = 1
    Output: [1]
    Explanation: The arrays we are merging are [] and [1].
    The result of the merge is [1].
    Note that because m = 0, there are no elements in nums1. The 0 is only there to ensure the merge result can fit in nums1.


    Constraints:

    nums1.length == m + n
    nums2.length == n
    0 <= m, n <= 200
    1 <= m + n <= 200
    -109 <= nums1[i], nums2[j] <= 109*/

    public static void main(String[] args) {
        Leetcode88 solution = new Leetcode88();
        int[] nums11 = new int[]{1, 2, 3, 0, 0, 0};
        int m1 = 3;
        int[] nums21 = new int[]{2, 5, 6};
        int n1 = 3;
        solution.merge(nums11, m1, nums21, n1);
        System.out.println(Arrays.toString(nums11));
        //Output: [1,2,2,3,5,6]
        int[] nums12 = new int[]{1};
        int m2 = 1;
        int[] nums22 = new int[0];
        int n2 = 0;
        solution.merge(nums12, m2, nums22, n2);
        System.out.println(Arrays.toString(nums12));
        //Output: [1]
        int[] nums13 = new int[]{0};
        int m3 = 0;
        int[] nums23 = new int[]{1};
        int n3 = 1;
        solution.merge(nums13, m3, nums23, n3);
        System.out.println(Arrays.toString(nums13));
        //Output: [1]
        int[] nums14 = new int[]{2,0};
        int m4 = 1;
        int[] nums24 = new int[]{1};
        int n4 = 1;
        solution.merge(nums14, m4, nums24, n4);
        System.out.println(Arrays.toString(nums14));
        //Output: [1,2]
    }

    public void merge(int[] nums1, int m, int[] nums2, int n) {
        if (m == 0 && n == 0) {
            return;
        }
        if (m == 0) {
            System.arraycopy(nums2, 0, nums1, 0, m + n);
            return;
        }
        if (n == 0) {
            return;
        }
        int[] result = new int[m + n];
        for (int i = 0, j = 0, k = 0; k < m + n; ) {
            if (i >= m && j < n) {
                result[k++] = nums2[j++];
            } else {
                if (j >= n) {
                    result[k++] = nums1[i++];
                } else {
                    if (nums1[i] < nums2[j]) {
                        result[k++] = nums1[i++];
                    } else {
                        result[k++] = nums2[j++];
                    }
                }
            }
        }
        if (m + n >= 0) {
            System.arraycopy(result, 0, nums1, 0, m + n);
        }
    }
}