package org.just.leetcode.leetcode3477;

public class Solution {

    public int numOfUnplacedFruits(int[] fruits, int[] baskets) {
        int result;
        int countPlacedTypes = 0;
        for (int i = 0; i < fruits.length; i++) {
            for (int j = 0; j < baskets.length; j++) {
                if (fruits[i] <= baskets[j]) {
                    countPlacedTypes++;
                    baskets[j] = -1;
                    break;
                }
            }
        }
        result = fruits.length - countPlacedTypes;
        return result;
    }
}