// Basic Calculator 224

import java.util.ArrayDeque;
import java.util.Deque;

class BasicCalculator224 {
    public static void main(String[] args) {
        String s="(1+(4+5+2)-3)+(6+8)";
        System.out.println(calculate(s));
    }
  public static int calculate(String s) {
    int ans = 0;
    int num = 0;
    int sign = 1;
    Deque<Integer> stack = new ArrayDeque<>(); 
    stack.push(sign);

    for (final char c : s.toCharArray())
      if (Character.isDigit(c))
        num = num * 10 + (c - '0');
      else if (c == '(')
        stack.push(sign);
      else if (c == ')')
        stack.pop();
      else if (c == '+' || c == '-') {
        ans += sign * num;
        sign = (c == '+' ? 1 : -1) * stack.peek();
        num = 0;
      }
    return ans + sign * num;
  }
}
