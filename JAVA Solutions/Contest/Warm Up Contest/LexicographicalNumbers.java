import java.util.ArrayList;
import java.util.List;

public class LexicographicalNumbers {
    class Solution {
    public List<Integer> lexicalOrder(int n) {
        List<Integer> res = new ArrayList<Integer>();
        int curr = 1;
        for(int i = 1; i <= n; i++){
            res.add(curr);
            if(curr * 10 <= n){
                curr *= 10;
            }else if(curr + 1 <= n && curr % 10 != 9){
                curr += 1;
            }else{
                while(curr / 10 % 10 == 9){
                    curr = curr / 10;
                }
                curr = curr / 10 +1;
            }

        }

        return res;
    }
}
    public static void main(String[] args) {
        LexicographicalNumbers l = new LexicographicalNumbers();
        Solution s = l.new Solution();
        System.out.println(s.lexicalOrder(13));
    }
}