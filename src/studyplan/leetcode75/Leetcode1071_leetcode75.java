package studyplan.leetcode75;

import java.util.Scanner;

public class Leetcode1071_leetcode75 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str1 = in.next();
        String str2 = in.next();
        Leetcode1071_leetcode75 leetcode = new Leetcode1071_leetcode75();
        System.out.println(leetcode.gcdOfStrings(str1, str2));
    }

    public String gcdOfStrings(String str1, String str2) {
        String result;
        if (str1.length() >= str2.length()) {
            result = str2;
        } else {
            result = str1;
        }
        for (int i = result.length() - 1; i >= 0; i--) {
            String[] str1Split = str1.split(result);
            String[] str2Split = str2.split(result);
            if (str1Split.length == 0 && str2Split.length == 0) {
                break;
            } else {
                result = result.substring(0, i);
            }
        }
        return result;
    }
}