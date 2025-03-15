package org.just.leetcode.leetcode1773;

import java.util.List;

public class Solution {

    public int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
        int result = 0;
        for (List<String> item : items) {
            switch (ruleKey) {
                case "type":
                    if (ruleValue.equals(item.get(0))) {
                        result++;
                    }
                    break;
                case "color":
                    if (ruleValue.equals(item.get(1))) {
                        result++;
                    }
                    break;
                case "name":
                    if (ruleValue.equals(item.get(2))) {
                        result++;
                    }
                    break;
            }
        }
        return result;
    }
}