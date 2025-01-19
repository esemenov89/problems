package studyplan.leetcode75;

import java.util.Arrays;
import java.util.Date;

public class Leetcode1679_leetcode75 {

/*

You are given an integer array nums and an integer k.
In one operation, you can pick two numbers from the array whose sum equals k and remove them from the array.
Return the maximum number of operations you can perform on the array.


Example 1:

Input: nums = [1,2,3,4], k = 5
Output: 2
Explanation: Starting with nums = [1,2,3,4]:
- Remove numbers 1 and 4, then nums = [2,3]
- Remove numbers 2 and 3, then nums = []
There are no more pairs that sum up to 5, hence a total of 2 operations.
Example 2:

Input: nums = [3,1,3,4,3], k = 6
Output: 1
Explanation: Starting with nums = [3,1,3,4,3]:
- Remove the first two 3's, then nums = [1,4,3]
There are no more pairs that sum up to 6, hence a total of 1 operation.


Constraints:

1 <= nums.length <= 10^5
1 <= nums[i] <= 10^9
1 <= k <= 10^9

*/

    public static void main(String[] args) {
        Leetcode1679_leetcode75 solution = new Leetcode1679_leetcode75();
        long startDate = new Date().getTime();
        System.out.println("height");
        int[] height = new int[]{1, 8, 6, 2, 5, 4, 8, 3, 7};
        System.out.println(solution.maxArea(height) + " seconds:" + (new Date().getTime() - startDate) / 1000);
        System.out.println("-----");
        //Output: 49
        startDate = new Date().getTime();
        int[] height2 = new int[]{1, 1};
        System.out.println(solution.maxArea(height2) + " seconds:" + (new Date().getTime() - startDate) / 1000);
        System.out.println("-----");
        // Output: 1
        startDate = new Date().getTime();
        int[] height3 = new int[100000];
        Arrays.fill(height3, 1);
        System.out.println(solution.maxArea(height3) + " seconds:" + (new Date().getTime() - startDate) / 1000);
        System.out.println("-----");
        // Output: 99999
        startDate = new Date().getTime();
        int[] height4 = new int[100000];
        Arrays.fill(height4, 10000);
        System.out.println(solution.maxArea(height4) + " seconds:" + (new Date().getTime() - startDate) / 1000);
        System.out.println("-----");
        // Output: 999990000
    }

    public int maxArea(int[] height) {
        int result = 0;
        int s;
        int containerVolume;
        for (int i = 0; i < height.length; i++) {
            if (height[i] * height.length - 1 - i < result) {
                continue;
            }
            for (int j = i + 1; j < height.length; j++) {
                s = Math.min(height[i], height[j]);
                containerVolume = s * (j - i);
                if (containerVolume > result) {
                    result = containerVolume;
                }
            }
        }
        return result;
    }
}