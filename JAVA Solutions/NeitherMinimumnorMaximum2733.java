import java.util.Arrays;

public class NeitherMinimumnorMaximum2733 {
    public static void main(String[] args) {
        int[] nums={3,2,1,4};
        System.out.println(findNonMinOrMax(nums));

    }
 
  static int findNonMinOrMax(int[] nums) {
    if (nums.length < 3)
      return -1;
    Arrays.sort(nums, 0, 3);
    return nums[1];
  }
}