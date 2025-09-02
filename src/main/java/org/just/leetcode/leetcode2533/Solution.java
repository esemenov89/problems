package org.just.leetcode.leetcode2533;

import java.util.ArrayList;
import java.util.List;

public class Solution {

    public int[] separateDigits(int[] nums) {
        int[] result;
        List<Integer> list = new ArrayList<>();
        for (int num : nums) {
            if (num < 10) {
                list.add(num);
            } else {
                String s = String.valueOf(num);
                for (int j = 0; j < s.length(); j++) {
                    list.add(Integer.parseInt(s.substring(j, j + 1)));
                }
            }
        }
        result = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            result[i] = list.get(i);
        }
        return result;
    }
}