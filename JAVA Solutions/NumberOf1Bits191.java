// class Solution {
//     public int hammingWeight(int n) {
//       int ans = 0;
//       for (int i = 0; i < 32; ++i)
//         if (((n >> i) & 1) == 1){
//           ++ans;
//         }
//       return ans;
//     }
// };
// public class NumberOf1Bits191{
//     public static void main(String[] args) {
//         int n=00000000000000000000000000001011;
//         Solution s1 = new Solution();
//         int res= s1.hammingWeight(n);
//         System.out.println(res);
//     }
// }

public class NumberOf1Bits191{
  public static void main(String[] args) {
    int n=00000000000000000000000000001011;
    n=hammingWeight(n);
    System.out.println(n);
  }
  public static int hammingWeight(int n) {
      int ans = 0;
      for (int i = 0; i < 32; ++i)
        if (((n >> i) & 1) == 1){
          ++ans;
        }
      return ans;
    }
}