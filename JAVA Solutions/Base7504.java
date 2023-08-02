public class Base7504 {
    public static void main(String[] args) {
        Base7504 base7504 = new Base7504();
        System.out.println(base7504.convertToBase7(100));
        System.out.println(base7504.convertToBase7(-7));
        Solution solution = base7504.new Solution();
        System.out.println(solution.convertToBase7(100));
        System.out.println(solution.convertToBase7(-7));

    }
    class Solution {
        public String convertToBase7(int num) {
          if (num < 0)
            return "-" + convertToBase7(-num);
          if (num < 7)
            return String.valueOf(num);
          return convertToBase7(num / 7) + String.valueOf(num % 7);
        }
      }

    public String convertToBase7(int num) {
        if (num == 0) return "0";
        StringBuilder sb = new StringBuilder();
        boolean isNegative = num < 0;
        if (isNegative) num = -num;
        while (num > 0) {
            sb.append(num % 7);
            num /= 7;
        }
        if (isNegative) sb.append('-');
        return sb.reverse().toString();
    }
}