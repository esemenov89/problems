package org.just.leetcode.leetcode2965;

import java.util.Arrays;

public class Solution {

    public int[] findMissingAndRepeatedValues(int[][] grid) {
        int[] result = new int[2];
        int[] temp = new int[grid.length * grid[0].length];
        int index = 0;
        for (int[] arr : grid) {
            for (int num : arr) {
                temp[index++] = num;
            }
        }
        Arrays.sort(temp);
        index = 0;
        for (int i = 1; i < temp.length; i++) {
            if (result[0] == 0 && temp[i] == temp[i - 1]) {
                result[0] = temp[i];
                index++;
            }
            if (result[1] == 0 &&temp[index] != i) {
                result[1] = i;
            }
            index++;
            if (result[0] != 0 && result[1] != 0) {
                break;
            }
        }
        if (result[1] == 0) {
            result[1] = temp.length;
        }
        return result;
    }
}