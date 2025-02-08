package org.just.leetcode.leetcode75;

import java.util.Scanner;

public class Leetcode605_leetcode75 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int count = in.nextInt();
        int[] flowerbed = new int[count];
        for (int i = 0; i < count; i++) {
            flowerbed[i] = in.nextInt();
        }
        int flower = in.nextInt();
        Leetcode605_leetcode75 leetcode = new Leetcode605_leetcode75();
        System.out.println(leetcode.canPlaceFlowers(flowerbed, flower));
    }

    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        if (flowerbed.length == 1 && flowerbed[0] == 0 && n == 1) {
            return true;
        }
        boolean isEmpty = false;
        int firstEmptyIndex = 0;
        for (int i = 0; i < flowerbed.length; i++) {
            if (flowerbed[i] == 0 && !isEmpty) {
                isEmpty = true;
                firstEmptyIndex = i;
            }
            if (flowerbed[i] == 1 && isEmpty) {
                isEmpty = false;
                if (firstEmptyIndex == 0) {
                    n -= (i - firstEmptyIndex) / 2;
                } else {
                    n -= (i - firstEmptyIndex - 1) / 2;
                }
            }
            if (flowerbed[i] == 0 && i == flowerbed.length - 1 && isEmpty) {
                isEmpty = false;
                if (firstEmptyIndex == 0) {
                    n -= (i + 2 - firstEmptyIndex) / 2;
                } else {
                    n -= (i + 1 - firstEmptyIndex) / 2;
                }
            }
        }
        return n <= 0;
    }
}