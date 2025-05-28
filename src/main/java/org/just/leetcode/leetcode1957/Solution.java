package org.just.leetcode.leetcode1957;

public class Solution {

    public String makeFancyString(String s) {
        String result;
        StringBuilder sb = new StringBuilder();
        char c;
        for (int i = 0; i < s.length(); i++) {
            if (i < s.length() - 2 && s.charAt(i) == s.charAt(i + 1) && s.charAt(i) == s.charAt(i + 2)) {
                sb.append(s.charAt(i + 1));
                sb.append(s.charAt(i + 2));
                c = s.charAt(i);
                i += 2;
                while (i < s.length() - 1 && c == s.charAt(i)) {
                    i++;
                }
                if (i < s.length() && c != s.charAt(i)) {
                    i--;
                }
            } else {
                sb.append(s.charAt(i));
            }
        }
        result = sb.toString();
        return result;
    }
}