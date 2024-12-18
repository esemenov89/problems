public class Leetcode26 {

    public static void main(String[] args) {
        Leetcode26 leetcode = new Leetcode26();
        //int[] nums = new int[]{1, 1, 2};
        int[] nums = new int[]{0, 0, 1, 1, 1, 2, 2, 3, 3, 4};
        int k = leetcode.removeDuplicates(nums);
        System.out.print(k + ", [");
        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i]);
            if (i != nums.length - 1) {
                System.out.print(",");
            }
        }
        System.out.print("]");
    }

    public int removeDuplicates(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;
        }
        int k = 1;
        int[] resultNums = new int[nums.length];
        resultNums[0] = nums[0];
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[i - 1]) {
                resultNums[k++] = nums[i];
            }
        }
        for (int i = 1; i < nums.length; i++) {
            nums[i] = resultNums[i];
        }
        return k;
    }
}