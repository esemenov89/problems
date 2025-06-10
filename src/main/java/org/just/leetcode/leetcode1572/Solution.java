package org.just.leetcode.leetcode1572;

public class Solution {

    public int diagonalSum(int[][] mat) {
        int result = 0;
        for (int i = 0, j = 0, k = mat.length - 1; i < mat.length && j <mat.length && k >=0; i++, j++, k--) {
            result += mat[i][j];
            if (j != k) {
                result += mat[i][k];
            }
        }
        return result;
    }
}