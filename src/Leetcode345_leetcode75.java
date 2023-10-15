import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class Leetcode345_leetcode75 {

    private static final Set<Character> vowels = Set.of('a', 'e', 'i', 'o', 'u');

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        Leetcode345_leetcode75 leetcode = new Leetcode345_leetcode75();
        System.out.println(leetcode.reverseVowels(s));
    }

    public String reverseVowels(String s) {
        String result = "";
        char[] sChar = s.toCharArray();
        for (char c : sChar) {

        }
        return result;
    }
}