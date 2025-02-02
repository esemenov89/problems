import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Leetcode15 {

    /*

Given an integer array nums, return all the triplets [nums[i], nums[j], nums[k]] such that i != j, i != k, and j != k, and nums[i] + nums[j] + nums[k] == 0.
Notice that the solution set must not contain duplicate triplets.

Example 1:
Input: nums = [-1,0,1,2,-1,-4]
Output: [[-1,-1,2],[-1,0,1]]
Explanation:
nums[0] + nums[1] + nums[2] = (-1) + 0 + 1 = 0.
nums[1] + nums[2] + nums[4] = 0 + 1 + (-1) = 0.
nums[0] + nums[3] + nums[4] = (-1) + 2 + (-1) = 0.
The distinct triplets are [-1,0,1] and [-1,-1,2].
Notice that the order of the output and the order of the triplets does not matter.

Example 2:
Input: nums = [0,1,1]
Output: []
Explanation: The only possible triplet does not sum up to 0.

Example 3:
Input: nums = [0,0,0]
Output: [[0,0,0]]
Explanation: The only possible triplet sums up to 0.


Constraints:
3 <= nums.length <= 3000
-10^5 <= nums[i] <= 10^5
    */

    public static void main(String[] args) {
        Leetcode15 solution = new Leetcode15();
        long startDate = new Date().getTime();
        int[] nums1 = new int[]{-1, 0, 1, 2, -1, -4};
        System.out.println("nums1: " + Arrays.toString(nums1));
/*        List<List<Integer>> result = solution.threeSum(nums1);
        System.out.println(result + " milliseconds:" + (new Date().getTime() - startDate));*/
        // [[-1, 0, 1], [-1, 2, -1]]
        startDate = new Date().getTime();
        int[] nums2 = new int[]{0, 1, 1};
        System.out.println("nums2: " + Arrays.toString(nums2));
/*        List<List<Integer>> resul2 = solution.threeSum(nums2);
        System.out.println(resul2 + " milliseconds:" + (new Date().getTime() - startDate));*/
        // []
        startDate = new Date().getTime();
        int[] nums3 = new int[]{0, 0, 0};
        System.out.println("nums3: " + Arrays.toString(nums3));
        List<List<Integer>> resul3 = solution.threeSum(nums3);
        System.out.println(resul3 + " milliseconds:" + (new Date().getTime() - startDate));
        // [[0, 0, 0]]
        startDate = new Date().getTime();
        int[] nums4 = new int[3000];
        for (int i = 0; i < 3000; i++) {
            if (i % 10 == 0) {
                nums4[i] = -1;
            } else if (nums4[i] % 10 == 1) {
                nums4[i] = 1;
            } else {
                nums4[i] = 0;
            }
        }
        System.out.println("nums4: " + Arrays.toString(nums4));
        List<List<Integer>> resul4 = solution.threeSum(nums4);
        System.out.println(resul4 + " milliseconds:" + (new Date().getTime() - startDate));
        // [[-1, 1, 0]]
    }

    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        Set<String> set = new HashSet<>();
        System.out.println("before triple");
        for (int i = 0; i < nums.length - 2; i++) {
            System.out.println(i);
            for (int j = i + 1; j < nums.length - 1; j++) {
                for (int k = j + 1; k < nums.length; k++) {
                    if (nums[i] + nums[j] + nums[k] == 0 && !set.contains(nums[i] + "=" + nums[j] + "=" + nums[k])) {
                        result.add(Arrays.asList(nums[i], nums[j], nums[k]));
                        set.add(nums[i] + "=" + nums[j] + "=" + nums[k]);
                    }
                }
            }
        }
        System.out.println("before remove");
        for (int i = 0; i < result.size(); i++) {
            for (int j = i + 1; j < result.size(); j++) {
                if (result.get(i).containsAll(result.get(j))) {
                    result.remove(j);
                }
            }
        }
        return result;
    }
}