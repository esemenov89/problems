package org.just.leetcode.study.plan.leetcode75.leetcode649;

public class Solution {

    public String predictPartyVictory(String senate) {
        String result = "";
        int banRadiant = 0;
        int banDire = 0;
        char[] chars = senate.toCharArray();
        boolean onlyRadiant;
        boolean onlyDire = true;
        for (int j = 0; j < chars.length; j++) {
            onlyRadiant = true;
            onlyDire = true;
            for (int i = 0; i < chars.length; i++) {
                if (chars[i] == 'R') {
                    onlyDire = false;
                    if (banRadiant > 0) {
                        while (banRadiant > 0 && chars[i] == 'R') {
                            chars[i] = '0';
                            banRadiant--;
                        }
                    } else {
                        banDire++;
                    }
                } else if (chars[i] == 'D') {
                    onlyRadiant = false;
                    if (banDire > 0) {
                        while (banDire > 0 && chars[i] == 'D') {
                            chars[i] = '0';
                            banDire--;
                        }
                    } else {
                        banRadiant++;
                    }
                }
            }
            if (onlyRadiant || onlyDire) {
                break;
            } else {
                j = 0;
            }
        }
        result = onlyDire ? "Dire" : "Radiant";
        return result;
    }
}