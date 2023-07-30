import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Permutations46 {
    public static void main(String[] args) {
        int[] nums = { 1, 2, 3 };
        List<List<Integer>> result = permute(nums);
        System.out.println(result);
    }

    public static  List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> resultList = new ArrayList<>();
        helper(resultList, new ArrayList<>(), nums);
        return resultList;
    }

    private static void helper(List<List<Integer>> resultList, ArrayList<Integer> tempList, int[] nums) {
        if (tempList.size() == nums.length) {
            resultList.add(new ArrayList<>(tempList));
            return;
        }

        for (int number : nums) {
            if (tempList.contains(number))
                continue;
            tempList.add(number);
            helper(resultList, tempList, nums);
            tempList.remove(tempList.size() - 1);
        }
    };
}
