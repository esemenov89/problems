package org.just.leetcode;

public class Leetcode66 {

/*    Example 1:

    Input: digits = [1,2,3]
    Output: [1,2,4]
    Explanation: The array represents the integer 123.
    Incrementing by one gives 123 + 1 = 124.
    Thus, the result should be [1,2,4].
    Example 2:

    Input: digits = [4,3,2,1]
    Output: [4,3,2,2]
    Explanation: The array represents the integer 4321.
    Incrementing by one gives 4321 + 1 = 4322.
    Thus, the result should be [4,3,2,2].
    Example 3:

    Input: digits = [9]
    Output: [1,0]
    Explanation: The array represents the integer 9.
    Incrementing by one gives 9 + 1 = 10.
    Thus, the result should be [1,0].*/

    public static void main(String[] args) {
        Leetcode66 solution = new Leetcode66();
        int[] digits1 = new int[]{1, 2, 3};
        int[] digits2 = new int[]{4, 3, 2, 1};
        int[] digits3 = new int[]{9};
        solution.print(solution.plusOne(digits1));
        System.out.println();
        solution.print(solution.plusOne(digits2));
        System.out.println();
        solution.print(solution.plusOne(digits3));
    }

    public int[] plusOne(int[] digits) {
        int[] subResult = new int[digits.length + 1];
        int[] result;
        boolean needPlusOne = false;
        for (int i = digits.length - 1; i >= 0; i--) {
            if (i == digits.length - 1) {
                if (digits[i] < 9) {
                    subResult[i + 1] = digits[i] + 1;
                } else {
                    subResult[i + 1] = 0;
                    needPlusOne = true;
                }
            } else {
                if (needPlusOne) {
                    if (digits[i] < 9) {
                        subResult[i + 1] = digits[i] + 1;
                        needPlusOne = false;
                    } else {
                        subResult[i + 1] = 0;
                        needPlusOne = true;
                    }
                } else {
                    subResult[i + 1] = digits[i];
                }
            }
        }
        if (needPlusOne) {
            subResult[0] = 1;
            result = subResult;
        } else {
            result = new int[subResult.length - 1];
            for (int i = 1; i < subResult.length; i++) {
                result[i - 1] = subResult[i];
            }
        }
        return result;
    }

    private void print(int[] digits) {
        System.out.print("[");
        for (int i = 0; i < digits.length; i++) {
            System.out.print(digits[i]);
            if (i != digits.length - 1) {
                System.out.print(",");
            }
        }
        System.out.print("]");
    }
}