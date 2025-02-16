package org.just.leetcode.leetcode2053;

import java.util.HashMap;
import java.util.Map;

public class Solution {

    public String kthDistinct(String[] arr, int k) {
        String result = "";
        Map<String, Integer[]> map = new HashMap<>();
        Integer[] temp;
        for (int i = 0; i < arr.length; i++) {
            temp = map.get(arr[i]);
            if (temp == null) {
                map.put(arr[i], new Integer[]{1, i});
            } else {
                map.put(arr[i], new Integer[]{2, i});
            }
        }
        int count = k;
        for (String s : arr) {
            temp = map.get(s);
            if (temp[0] == 1) {
                count--;
                if (count == 0) {
                    result = s;
                    break;
                }
            }
        }
        return result;
    }
}