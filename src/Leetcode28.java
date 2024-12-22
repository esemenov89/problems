import java.util.Scanner;

public class Leetcode28 {

    public static void main(String[] args) {
        String haystack = "leetcode";
        String needle = "leeto";
        Leetcode28 solution = new Leetcode28();
        System.out.println(solution.strStr(haystack, needle));
    }

    public int strStr(String haystack, String needle) {
        return haystack.indexOf(needle);
    }
}