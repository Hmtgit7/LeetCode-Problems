import java.util.*;

public class BinaryPrefixDivisibleByFIve1018{
    public static void main(String[] args){
        int[] nums={0,1,1,1,1,1};
        List<Boolean> res=prefixesDivBy5(nums);
        System.out.println(res);
    }
    public static List<Boolean> prefixesDivBy5(int[] nums) {
       List<Boolean> res=new ArrayList<>();
       int num=nums[0];
       Boolean dBFive=num%5==0?true:false;
       res.add(dBFive);
       for(int i=1; i<nums.length; i++){
           if(nums[i]==1){
               num=num*2+1;
           }
           else{
               num=num*2;
           }
           if(num%5==0)res.add(true);
           if(num%5!=0) res.add(false);
           num=num%5;
       }
        return res;
    }

}