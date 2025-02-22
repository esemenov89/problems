package org.just.leetcode.leetcode3280;

public class Solution {

    public String convertDateToBinary(String date) {
        StringBuilder binary = new StringBuilder();
        String[] dividedDate = date.split("-");
        for (int i = 0; i < dividedDate.length; i++) {
            binary.append(Integer.toBinaryString(Integer.parseInt(dividedDate[i])));
            if (i < dividedDate.length - 1) {
                binary.append("-");
            }
        }
        return binary.toString();
    }
}