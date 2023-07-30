public class RemoveDuplicatesSortedArray80 {
    public static void main(String[] args) {
        int[] nums = { 0, 0, 1, 1, 1, 1, 2, 3, 3 };
        int res = removeDuplicates(nums);
        System.out.println(res);
    }

    public static int removeDuplicates(int[] nums) {
        int i = 0;
        for (int it = 0; it < nums.length; it++) {
            if (i == 0 || i == 1 || nums[i - 2] != nums[it]) {
                nums[i] = nums[it];
                i++;
            }
        }
        return i;
    }
}