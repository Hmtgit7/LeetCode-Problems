public class FindTheDifference {
    public static void main(String[] args) {
        String s = "abcd";
        String t = "abcde";
        char c = findTheDifference(s, t);
        System.out.println(c);
    }

    public static char findTheDifference(String s, String t) {
        char ans = 0;

        for (final char c : s.toCharArray())
            ans ^= c;

        for (final char c : t.toCharArray())
            ans ^= c;

        return ans;
    }
}