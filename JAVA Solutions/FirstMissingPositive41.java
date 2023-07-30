public class FirstMissingPositive41{
    public static void main(String[] args) {
        int[] nums={3,4,-1,1};
        System.out.println(firstMissingPositive(nums));
    }
    public static int firstMissingPositive(int[] nums) {
        int i=0;
        while(i<nums.length){
            int correct=nums[i]-1;
            if(nums[i]>0 && nums[i]<=nums.length && nums[i]!=nums[correct]){
                swap(nums,i,correct);
            }
            else{
                i++;
            }
        }
        //case 1:
        for(int idx=0;idx<nums.length;idx++){
            if(nums[idx]!=idx+1){
                return idx+1;
            }
        } 
        // case 2:
        return nums.length+1;
    }
    public static void swap(int[] nums,int first,int second)
    {
        int temp=nums[first];
        nums[first]=nums[second];
        nums[second]=temp;
    }
}