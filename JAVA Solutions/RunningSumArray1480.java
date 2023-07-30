import java.util.Arrays;

public class RunningSumArray1480 {
    public static void main(String[] args){
        int[] nums={1,2,3,4};
        nums=runningSum(nums);
        System.out.println(Arrays.toString(nums));

    }
    public static int[] runningSum(int[] nums) {
        int[] ans= new int[nums.length];
        int sum=0;
        for(int i=0; i<nums.length; i++){
            sum+=nums[i];
            ans[i]=sum;
        }
        return ans;
    }
}
