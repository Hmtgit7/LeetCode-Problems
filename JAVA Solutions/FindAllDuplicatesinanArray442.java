import java.util.ArrayList;
import java.util.List;

public class FindAllDuplicatesinanArray442 {
    public static void main(String[] args) {
        int[] nums={4,3,2,7,8,2,3,1};
        System.out.println((findDuplicates(nums)));
    }
     public static List<Integer> findDuplicates(int[] nums) {
        
        int i=0;
        while(i<nums.length){
            int correct=nums[i]-1;
            if(nums[i]!=nums[correct]){
                swap(nums,i,correct);
            }
            else {
                i++;
            }
        }
            List<Integer>ans=new ArrayList<>();
            for(int idx=0;idx<nums.length;idx++){
                if(nums[idx]!=idx+1){
                    ans.add(nums[idx]);
                }
            }
        return ans;
    }
    public static void swap(int[] nums , int first , int second){
        int temp=nums[first];
        nums[first]=nums[second];
        nums[second]=temp;
    }
}
