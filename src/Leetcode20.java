public class Leetcode20 {

    public static void main(String[] args) {
        Leetcode20 leetcode = new Leetcode20();
        String s = "()"; // true
        System.out.println(leetcode.isValid(s));
        s = "()[]{}"; // true
        System.out.println(leetcode.isValid(s));
        s = "(]"; // false
        System.out.println(leetcode.isValid(s));
        s = "([])"; // true
        System.out.println(leetcode.isValid(s));
        s = "([()]){}"; // true
        System.out.println(leetcode.isValid(s));
        s = "([())){}"; // false
        System.out.println(leetcode.isValid(s));
        s = "{}[]{}"; // true
        System.out.println(leetcode.isValid(s));
        s = "{}[}{]"; // true
        System.out.println(leetcode.isValid(s));
    }

    public boolean isValid(String s) {
        if (s.length() % 2 != 0) {
            return false;
        }
        for (int i = 0; i < s.length(); i++) {
            switch (s.charAt(i)) {
                case '(':
                    if (i == s.length() - 1) {
                        return false;
                    }
                    if (s.charAt(i + 1) == ')') {
                        if (i == 0) {
                            if (i + 1 == s.length() - 1) {
                                return true;
                            } else {
                                s = s.substring(i + 1, s.length() - 1);
                            }
                        }
                        s = s.substring(0, i - 1) + s.substring(i + 1);
                    }
                    break;
                case '[':
                    if (i == s.length() - 1) {
                        return false;
                    }
                    if (s.charAt(i + 1) == ']') {
                        if (i == 0) {
                            if (i + 1 == s.length() - 1) {
                                return true;
                            } else {
                                s = s.substring(i + 1, s.length() - 1);
                            }
                        }
                        s = s.substring(0, i - 1) + s.substring(i + 1);
                    }
                    break;
                case '{':
                    if (i == s.length() - 1) {
                        return false;
                    }
                    if (s.charAt(i + 1) == '}') {
                        if (i == 0) {
                            if (i + 1 == s.length() - 1) {
                                return true;
                            } else {
                                s = s.substring(i + 1, s.length() - 1);
                            }
                        }
                        s = s.substring(0, i - 1) + s.substring(i + 1);
                    }
                    break;
            }
        }
        return true;
    }
}