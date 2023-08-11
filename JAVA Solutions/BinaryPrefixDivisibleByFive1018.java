import java.util.*;

public class BinaryPrefixDivisibleByFive1018 {
    public static void main(String[] args) {
        int[] nums = { 0, 1, 1, 1, 1, 1 }; // 0 2 4 8 16 32
        List<Boolean> res = prefixesDivBy5(nums);
        List<Boolean> ans = prefixesDivBySecond5(nums);
        System.out.println(res);
    }

    public static List<Boolean> prefixesDivBy5(int[] nums) {
        List<Boolean> res = new ArrayList<>();
        int num = nums[0];
        Boolean dBFive = num % 5 == 0 ? true : false;
        res.add(dBFive);
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] == 1) {
                num = num * 2 + 1;
            } else {
                num = num * 2;
            }
            if (num % 5 == 0)
                res.add(true);
            if (num % 5 != 0)
                res.add(false);
            num = num % 5;
        }
        return res;
    }

    public static List<Boolean> prefixesDivBySecond5(int[] nums) {
        List<Boolean> ans = new ArrayList<>();
        int curr = 0;
        for (final int num : nums) {
            curr = (curr * 2 + num) % 5;
            ans.add(curr % 5 == 0);
        }
        return ans;
    }
}

