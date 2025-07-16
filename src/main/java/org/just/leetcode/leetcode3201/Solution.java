package org.just.leetcode.leetcode3201;

public class Solution {

    public int maximumLength(int[] nums) {
        int result;
        int[] zeroFirst = new int[2];
        int[] oneFirst = new int[2];
        int[] zeroNotFirst = new int[2];
        int[] oneNotFirst = new int[2];
        for (int i = 0; i < nums.length; i++) {
            if (i == 0) {
                zeroFirst[0] = nums[i];
                oneFirst[0] = nums[i];
                zeroFirst[1] = 1;
                oneFirst[1] = 1;
            } else {
                if ((zeroFirst[0] + nums[i]) % 2 == 0) {
                    zeroFirst[1]++;
                    zeroFirst[0] = nums[i];
                }
                if ((oneFirst[0] + nums[i]) % 2 == 1) {
                    oneFirst[1]++;
                    oneFirst[0] = nums[i];
                }
                if (zeroNotFirst[0] != 0) {
                    if ((zeroNotFirst[0] + nums[i]) % 2 == 0) {
                        zeroNotFirst[1]++;
                        zeroNotFirst[0] = nums[i];
                    }
                    if ((oneFirst[0] + nums[i]) % 2 == 1) {
                        oneNotFirst[1]++;
                        oneNotFirst[0] = nums[i];
                    }
                }
                if (zeroNotFirst[0] == 0 && nums[0] % 2 != nums[i] % 2) {
                    zeroNotFirst[0] = nums[i];
                    oneNotFirst[0] = nums[i];
                    zeroNotFirst[1] = 1;
                    oneNotFirst[1] = 1;
                }
            }
        }
        result = Math.max(Math.max(zeroFirst[1], oneFirst[1]), Math.max(zeroNotFirst[1], oneNotFirst[1]));
        return result;
    }

/*            for (int i = 0; i < nums.length - 1; i++) {
        Integer temp = map.get((nums[i] + nums[i + 1]) % 2);
        if (temp != null) {
            map.put((nums[i] + nums[i + 1]) % 2, ++temp);
        } else {
            map.put((nums[i] + nums[i + 1]) % 2, 2);
        }
    }
        for (Integer value : map.values()) {
        if (value > result) {
            result = value;
        }
    }*/
}