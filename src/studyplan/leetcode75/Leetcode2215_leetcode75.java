package studyplan.leetcode75;

import java.util.*;

public class Leetcode2215_leetcode75 {

/*

Given two 0-indexed integer arrays nums1 and nums2, return a list answer of size 2 where:

answer[0] is a list of all distinct integers in nums1 which are not present in nums2.
answer[1] is a list of all distinct integers in nums2 which are not present in nums1.
Note that the integers in the lists may be returned in any order.



Example 1:
Input: nums1 = [1,2,3], nums2 = [2,4,6]
Output: [[1,3],[4,6]]
Explanation:
For nums1, nums1[1] = 2 is present at index 0 of nums2, whereas nums1[0] = 1 and nums1[2] = 3 are not present in nums2. Therefore, answer[0] = [1,3].
For nums2, nums2[0] = 2 is present at index 1 of nums1, whereas nums2[1] = 4 and nums2[2] = 6 are not present in nums2. Therefore, answer[1] = [4,6].

Example 2:
Input: nums1 = [1,2,3,3], nums2 = [1,1,2,2]
Output: [[3],[]]
Explanation:
For nums1, nums1[2] and nums1[3] are not present in nums2. Since nums1[2] == nums1[3], their value is only included once and answer[0] = [3].
Every integer in nums2 is present in nums1. Therefore, answer[1] = [].

Constraints:
1 <= nums1.length, nums2.length <= 1000
-1000 <= nums1[i], nums2[i] <= 1000

*/

    public static void main(String[] args) {
        Leetcode2215_leetcode75 solution = new Leetcode2215_leetcode75();
        long startDate = new Date().getTime();
        int[] nums11 = new int[]{1, 2, 3};
        int[] nums21 = new int[]{2, 4, 6};
        System.out.println("-- 1 --");
        System.out.println(solution.findDifference(nums11, nums21) + " milliseconds:" + (new Date().getTime() - startDate));
        System.out.println("-----");
        //Output: [[1, 3], [4, 6]]
        startDate = new Date().getTime();
        int[] nums12 = new int[]{1, 2, 3, 3};
        int[] nums22 = new int[]{1, 1, 2, 2};
        System.out.println("-- 2 --");
        System.out.println(solution.findDifference(nums12, nums22) + " milliseconds:" + (new Date().getTime() - startDate));
        System.out.println("-----");
        //Output: [[3], []]
        startDate = new Date().getTime();
        int[] nums13 = new int[1000];
        int[] nums23 = new int[1000];
        for (int i = 0; i < 1000; i++) {
            nums13[i] = i - 1000;
            nums23[i] = i;
        }
        System.out.println("-- 3 --");
        System.out.println(solution.findDifference(nums13, nums23) + " milliseconds:" + (new Date().getTime() - startDate));
        System.out.println("-----");
        //Output: [[3], []]
    }

    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        List<List<Integer>> result = new ArrayList<>();
        Set<Integer> set1 = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();
        boolean contains;
        for (int num1 : nums1) {
            contains = false;
            for (int num2 : nums2) {
                if (num1 == num2) {
                    contains = true;
                    break;
                }
            }
            if (!contains) {
                set1.add(num1);
            }
        }

        for (int num2 : nums2) {
            contains = false;
            for (int num1 : nums1) {
                if (num2 == num1) {
                    contains = true;
                    break;
                }
            }
            if (!contains) {
                set2.add(num2);
            }
        }
        result.add(set1.stream().toList());
        result.add(set2.stream().toList());
        return result;
    }

    private void printNums(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            if (i == nums.length - 1) {
                System.out.print(nums[i]);
            } else {
                System.out.print(nums[i] + ", ");
            }
        }
        System.out.println();
    }
}