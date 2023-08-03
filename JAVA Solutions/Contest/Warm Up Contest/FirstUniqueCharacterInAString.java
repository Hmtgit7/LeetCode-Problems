public class FirstUniqueCharacterInAString {
    class Solution {
        public int firstUniqChar(String s) {
          int[] count = new int[128];
      
          for (final char c : s.toCharArray())
            ++count[c];
      
          for (int i = 0; i < s.length(); ++i)
            if (count[s.charAt(i)] == 1)
              return i;
      
          return -1;
        }
      }
      public static void main(String[] args) {
        FirstUniqueCharacterInAString f = new FirstUniqueCharacterInAString();
        Solution s = f.new Solution();
        System.out.println(s.firstUniqChar("leetcode"));
        Solution s1 = f.new Solution();
        System.out.println(s1.firstUniqChar("loveleetcode"));
        Solution s2 = f.new Solution();
        System.out.println(s2.firstUniqChar("aabb"));
      }
}
