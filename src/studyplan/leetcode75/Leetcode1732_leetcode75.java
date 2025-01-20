package studyplan.leetcode75;

import java.util.Arrays;
import java.util.Date;

public class Leetcode1732_leetcode75 {

/*
There is a biker going on a road trip. The road trip consists of n + 1 points at different altitudes. The biker starts his trip on point 0 with altitude equal 0.
You are given an integer array gain of length n where gain[i] is the net gain in altitude between points i​​​​​​ and i + 1 for all (0 <= i < n). Return the highest altitude of a point.


Example 1:

Input: gain = [-5,1,5,0,-7]
Output: 1
Explanation: The altitudes are [0,-5,-4,1,1,-6]. The highest is 1.
Example 2:

Input: gain = [-4,-3,-2,-1,4,3,2]
Output: 0
Explanation: The altitudes are [0,-4,-7,-9,-10,-6,-3,-1]. The highest is 0.


Constraints:

n == gain.length
1 <= n <= 100
-100 <= gain[i] <= 100
*/

    public static void main(String[] args) {
        Leetcode1732_leetcode75 solution = new Leetcode1732_leetcode75();
        long startDate = new Date().getTime();
        int[] nums = new int[]{1, 1, 0, 1};
        System.out.println(solution.longestSubarray(nums) + " milliseconds:" + (new Date().getTime() - startDate));
        System.out.println("-----");
        //Output: 3

        startDate = new Date().getTime();
        int[] nums2 = new int[]{0, 1, 1, 1, 0, 1, 1, 0, 1};
        System.out.println(solution.longestSubarray(nums2) + " milliseconds:" + (new Date().getTime() - startDate));
        System.out.println("-----");
        //Output: 5

        startDate = new Date().getTime();
        int[] nums3 = new int[]{1, 1, 1};
        System.out.println(solution.longestSubarray(nums3) + " milliseconds:" + (new Date().getTime() - startDate));
        System.out.println("-----");
        //Output: 2

        startDate = new Date().getTime();
        int[] nums4 = new int[]{1, 0, 1};
        System.out.println(solution.longestSubarray(nums4) + " milliseconds:" + (new Date().getTime() - startDate));
        System.out.println("-----");
        //Output: 2

        startDate = new Date().getTime();
        int[] nums5 = new int[]{1};
        System.out.println(solution.longestSubarray(nums5) + " milliseconds:" + (new Date().getTime() - startDate));
        System.out.println("-----");
        //Output: 0

        startDate = new Date().getTime();
        int[] nums6 = new int[100000];
        for (int i = 0; i < 100000; i++) {
            nums6[i] = i % 2;
        }
        solution.printNums(nums6);
        System.out.println(solution.longestSubarray(nums6) + " milliseconds:" + (new Date().getTime() - startDate));
        System.out.println("-----");
        //Output: 3

        startDate = new Date().getTime();
        int[] nums7 = new int[100000];
        Arrays.fill(nums7, 1);
        solution.printNums(nums7);
        System.out.println(solution.longestSubarray(nums7) + " milliseconds:" + (new Date().getTime() - startDate));
        System.out.println("-----");
        //Output: 99999

        startDate = new Date().getTime();
        int[] nums8 = new int[100000];
        Arrays.fill(nums8, 1);
        nums8[50000] = 0;
        solution.printNums(nums8);
        System.out.println(solution.longestSubarray(nums8) + " milliseconds:" + (new Date().getTime() - startDate));
        System.out.println("-----");
        //Output: 99999
    }

    public int largestAltitude(int[] gain) {
        int result = 0;
        return result;
    }

    public int longestSubarray(int[] nums) {
        int result = -1;
        int count;
        int countToFlip = 1;
        for (int i = 0; i < nums.length; i++) {
            if (result >= nums.length - i) {
                break;
            }
            count = 0;
            for (int j = i; j < nums.length; j++) {
                if (nums[j] == 1) {
                    count++;
                } else {
                    if (countToFlip == 0) {
                        break;
                    } else {
                        countToFlip--;
                    }
                }
            }
            countToFlip = 1;
            if (count > result) {
                result = count;
            }
        }
        if (result == nums.length) {
            result--;
        }
        return result;
    }

    private void printNums(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            if (i == nums.length - 1) {
                System.out.print(nums[i]);
            } else {
                System.out.print(nums[i] + ", ");
            }
        }
        System.out.println();
    }
}