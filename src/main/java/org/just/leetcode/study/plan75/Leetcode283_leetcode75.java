package org.just.leetcode.study.plan75;

import java.util.Arrays;
import java.util.Scanner;

public class Leetcode283_leetcode75 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int count = in.nextInt();
        int[] nums = new int[count];
        for (int i = 0; i < count; i++) {
            nums[i] = in.nextInt();
        }
        Leetcode283_leetcode75 leetcode = new Leetcode283_leetcode75();
        leetcode.moveZeroes(nums);
    }

    public void moveZeroes(int[] nums) {
        int minIndexNonZeroElement = 0;
        for (int i = 0; i < nums.length; i++) {
            minIndexNonZeroElement = i;
            if (nums[i] == 0) {
                if (nums[minIndexNonZeroElement] == 0) {
                    for (int j = minIndexNonZeroElement; j < nums.length; j++) {
                        if (nums[j] != 0) {
                            minIndexNonZeroElement = j;
                            break;
                        }
                    }
                }
                nums[i] = nums[minIndexNonZeroElement];
                nums[minIndexNonZeroElement] = 0;
            }
        }
        System.out.println(Arrays.toString(nums));
    }
}