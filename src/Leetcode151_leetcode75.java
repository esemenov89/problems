import java.util.Scanner;
import java.util.Stack;

public class Leetcode151_leetcode75 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.nextLine();
        Leetcode151_leetcode75 leetcode = new Leetcode151_leetcode75();
        System.out.println(leetcode.reverseWords(s));
    }

    public String reverseWords(String s) {
        StringBuilder result = new StringBuilder();
        Stack<String> words = new Stack<>();
        for (String s1 : s.trim().split(" ")) {
            if (!s1.isBlank()) {
                words.push(s1.trim());
            }
        }
        int wordsSize = words.size();
        for (int i = 0; i < wordsSize; i++) {
            result.append(words.pop());
            if (i != wordsSize - 1) {
                result.append(" ");
            }
        }
        return result.toString();
    }
}