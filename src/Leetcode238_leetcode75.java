import java.util.Arrays;
import java.util.Scanner;

public class Leetcode238_leetcode75 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int count = in.nextInt();
        int[] nums = new int[count];
        for (int i = 0; i < count; i++) {
            nums[i] = in.nextInt();
        }
        Leetcode238_leetcode75 leetcode = new Leetcode238_leetcode75();
        System.out.println(Arrays.toString(leetcode.productExceptSelf(nums)));
    }

    public int[] productExceptSelf(int[] nums) {
        // Пока решил только брутфорсом O(n^2). Попробовать решить O(n) в решениях там на самом деле O(2*n)
        // Получил Time Limit Exceeded :)
        int[] result = new int[nums.length];
        result[0] = 1;
        for (int i = 0; i < nums.length; i++) {
            result[i] = 1;
            for (int j = 0; j < nums.length; j++) {
                if (i != j) {
                    result[i] = result[i] * nums[j];
                }
            }
        }
        return result;
    }
}