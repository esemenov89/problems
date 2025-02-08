package org.just.leetcode;

import java.util.Scanner;

public class Leetcode1 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int count = in.nextInt();
        int[] nums = new int[count];
        for (int i = 0; i < count; i++) {
            nums[i] = in.nextInt();
        }
        int target = in.nextInt();
        Leetcode1 leetcode1 = new Leetcode1();
        int[] result = leetcode1.twoSum(nums, target);
        System.out.print('[');
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i]);
            if (i != result.length - 1) {
                System.out.print(',');
            }
        }
        System.out.print(']');
    }

    public int[] twoSum(int[] nums, int target) {
        int[] result = new int[2];
        boolean resultIsFound = false;
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length; j++) {
                if (i != j && nums[i] + nums[j] == target) {
                    result[0] = i;
                    result[1] = j;
                    resultIsFound = true;
                    break;
                }
            }
            if (resultIsFound) {
                break;
            }
        }
        return result;
    }
}