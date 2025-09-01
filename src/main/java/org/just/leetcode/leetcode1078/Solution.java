package org.just.leetcode.leetcode1078;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Solution {

    public String[] findOcurrences(String text, String first, String second) {
        List<String> list = new ArrayList<>();
        String[] arr = text.split(" ");
        for (int i = 0; i < arr.length - 2; i++) {
            if (arr[i].equals(first) && arr[i + 1].equals(second)) {
                list.add(arr[i + 2]);
            }
        }
        String[] result = list.toArray(new String[list.size()]);
        return result;
    }
}