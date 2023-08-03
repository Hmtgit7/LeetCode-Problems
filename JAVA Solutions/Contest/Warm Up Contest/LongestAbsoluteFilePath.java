public class LongestAbsoluteFilePath {
    class Solution {
        public int lengthLongestPath(String input) {
             if (input == null || input.length() == 0) {
                return 0;
            }
            String[] tokens = input.split("\n");
            int[] dirs = new int[tokens.length];
            int max = 0;
            int curr;
            for (int i = 0; i < tokens.length; i ++) {
                String s = tokens[i];
                int count = s.lastIndexOf("\t") + 1;
                s = s.substring(count);
                if (s.indexOf(".") != -1) {
                    //file
                    int cand = s.length();
                    if (count != 0) {
                        cand = dirs[count - 1] + s.length();
                    }
                    max = Math.max(max, cand);
                }
                else {
                    //folder
                    dirs[count] = s.length() + 1;
                    if (count != 0) {
                        dirs[count] += dirs[count - 1];
                    }
                }
            }
            return max;
        }
    }
    public static void main(String[] args) {
        LongestAbsoluteFilePath sol = new LongestAbsoluteFilePath();
        Solution s = sol.new Solution();
        String input = "dir\n\tsubdir1\n\tsubdir2\n\t\tfile.ext";
        System.out.println(s.lengthLongestPath(input));
    }
}
