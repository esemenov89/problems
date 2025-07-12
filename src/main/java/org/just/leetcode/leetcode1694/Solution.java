package org.just.leetcode.leetcode1694;

public class Solution {

    public String reformatNumber(String number) {
        String result;
        result = number.replaceAll("[- ]", "");
        if (result.length() == 2 || result.length() == 3) {
        } else if (result.length() == 4) {
            result = result.substring(0, 2) + "-" + result.substring(2);
        } else {
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < result.length() - 2; i += 3) {
                if (result.length() - i == 4) {
                    sb.append(result, i, i + 2).append("-").append(result.substring(i + 2));
                    break;
                }
                sb.append(result, i, i + 3);
                if (i + 3 < result.length()) {
                    sb.append("-");
                }
                if (i + 3 >= result.length() - 2) {
                    sb.append(result, i + 3, result.length());
                    break;
                }
            }
            result = sb.toString();
        }

        return result;
    }
}