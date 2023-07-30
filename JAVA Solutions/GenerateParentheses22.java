import java.util.ArrayList;
import java.util.List;
import java.util.*;

public class GenerateParentheses22 {
    public static void main(String[] args) {
        Scanner read=new Scanner(System.in);
        int n=read.nextInt();
        System.out.println(generateParenthesis(n));
        read.close();
    }
      
    static  List<String> generateParenthesis(int n) {
    List<String> ans = new ArrayList<>();
    dfs(n, n, new StringBuilder(), ans);
    return ans;
  }

  private static void dfs(int l, int r, final StringBuilder sb, List<String> ans) {
    if (l == 0 && r == 0) {
      ans.add(sb.toString());
      return;
    }

    if (l > 0) {
      sb.append("(");
      dfs(l - 1, r, sb, ans);
      sb.deleteCharAt(sb.length() - 1);
    }
    if (l < r) {
      sb.append(")");
      dfs(l, r - 1, sb, ans);
      sb.deleteCharAt(sb.length() - 1);
    }
  }
}