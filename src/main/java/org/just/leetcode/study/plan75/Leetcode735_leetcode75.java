package org.just.leetcode.study.plan75;

import java.util.Arrays;
import java.util.Date;
import java.util.Stack;

public class Leetcode735_leetcode75 {

/*

We are given an array asteroids of integers representing asteroids in a row. The indices of the asteriod in the array represent their relative position in space.
For each asteroid, the absolute value represents its size, and the sign represents its direction (positive meaning right, negative meaning left). Each asteroid moves at the same speed.
Find out the state of the asteroids after all collisions. If two asteroids meet, the smaller one will explode. If both are the same size, both will explode. Two asteroids moving in the same direction will never meet.


Example 1:
Input: asteroids = [5,10,-5]
Output: [5,10]
Explanation: The 10 and -5 collide resulting in 10. The 5 and 10 never collide.

Example 2:
Input: asteroids = [8,-8]
Output: []
Explanation: The 8 and -8 collide exploding each other.

Example 3:
Input: asteroids = [10,2,-5]
Output: [10]
Explanation: The 2 and -5 collide resulting in -5. The 10 and -5 collide resulting in 10.

Constraints:
2 <= asteroids.length <= 10^4
-1000 <= asteroids[i] <= 1000
asteroids[i] != 0

*/

    public static void main(String[] args) {
        Leetcode735_leetcode75 solution = new Leetcode735_leetcode75();
        long startDate = new Date().getTime();
        int[] asteroids = new int[]{5, 10, -5};
        System.out.println(Arrays.toString(asteroids));
        System.out.println(Arrays.toString(solution.asteroidCollision(asteroids)) + " milliseconds:" + (new Date().getTime() - startDate));
        System.out.println("-----");
        //Output: [5, 10]
        startDate = new Date().getTime();
        int[] asteroids2 = new int[]{8, -8};
        System.out.println(Arrays.toString(asteroids2));
        System.out.println(Arrays.toString(solution.asteroidCollision(asteroids2)) + " milliseconds:" + (new Date().getTime() - startDate));
        System.out.println("-----");
        //Output: []
        startDate = new Date().getTime();
        int[] asteroids3 = new int[]{10, 2, -5};
        System.out.println(Arrays.toString(asteroids3));
        System.out.println(Arrays.toString(solution.asteroidCollision(asteroids3)) + " milliseconds:" + (new Date().getTime() - startDate));
        System.out.println("-----");
        //Output: [10]
        startDate = new Date().getTime();
        int[] asteroids4 = new int[]{};
        System.out.println(Arrays.toString(asteroids4));
        System.out.println(Arrays.toString(solution.asteroidCollision(asteroids4)) + " milliseconds:" + (new Date().getTime() - startDate));
        System.out.println("-----");
        //Output: []
        startDate = new Date().getTime();
        int[] asteroids5 = new int[10000];
        for (int i = 0; i < 10000; i++) {
            if (i < 5000) {
                asteroids5[i] = -1000;
            } else {
                asteroids5[i] = 1000;
            }
        }
        System.out.println(Arrays.toString(asteroids5));
        System.out.println(Arrays.toString(solution.asteroidCollision(asteroids5)) + " milliseconds:" + (new Date().getTime() - startDate));
        System.out.println("-----");
        //Output: []
        startDate = new Date().getTime();
        int[] asteroids6 = new int[]{-2, -1, 1, 2};
        System.out.println(Arrays.toString(asteroids6));
        System.out.println(Arrays.toString(solution.asteroidCollision(asteroids6)) + " milliseconds:" + (new Date().getTime() - startDate));
        System.out.println("-----");
        //Output: [-2, -1, 1, 2]
    }

    public int[] asteroidCollision(int[] asteroids) {
        int[] result;
        Stack<Integer> stack = new Stack<>();
        for (int asteroid : asteroids) {
            addToStack(asteroid, stack);
        }
        result = new int[stack.size()];
        int index = 0;
        for (Integer val : stack) {
            result[index++] = val;
        }
        return result;
    }

    private void addToStack(int asteroid, Stack<Integer> stack) {
        if (stack.isEmpty()) {
            stack.push(asteroid);
        } else {
            if ((stack.peek() > 0 && asteroid < 0)) {
                if (Math.abs(asteroid) > Math.abs(stack.peek())) {
                    stack.pop();
                    addToStack(asteroid, stack);
                } else if (Math.abs(asteroid) == Math.abs(stack.peek())) {
                    stack.pop();
                }
            } else {
                stack.push(asteroid);
            }
        }
    }
}