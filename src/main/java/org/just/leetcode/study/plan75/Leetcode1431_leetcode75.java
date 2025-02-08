package org.just.leetcode.study.plan75;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Leetcode1431_leetcode75 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int countKids = in.nextInt();
        int[] candies = new int[countKids];
        for (int i = 0; i < countKids; i++) {
            candies[i] = in.nextInt();
        }
        int extraCandies = in.nextInt();
        Leetcode1431_leetcode75 leetcode = new Leetcode1431_leetcode75();
        System.out.println(leetcode.kidsWithCandies(candies, extraCandies));
    }

    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> result = new ArrayList<>();
        int max = 0;
        for (int candy : candies) {
            if (candy > max) {
                max = candy;
            }
        }
        for (int candy : candies) {
            if (candy + extraCandies >= max) {
                result.add(Boolean.TRUE);
            } else {
                result.add(Boolean.FALSE);
            }
        }
        return result;
    }
}