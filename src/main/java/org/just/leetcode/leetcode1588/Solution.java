package org.just.leetcode.leetcode1588;

public class Solution {

    public int sumOddLengthSubarrays(int[] arr) {
        int result = 0;
        int j;
        int temp;
        for (int i = 0; i < arr.length; i++) {
            result += arr[i];
            if (i >= 2) {
                if (i == 2) {
                    temp = 0;
                } else {
                    temp = i - 2;
                }
                while (temp >= 0) {
                    for (j = temp; j <= i; j++) {
                        result += arr[j];
                    }
                    temp = temp - 2;
                }
            }
        }
        return result;
    }
}