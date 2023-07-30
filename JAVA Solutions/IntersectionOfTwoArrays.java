import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;

public class IntersectionOfTwoArrays{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int m=sc.nextInt();
        int n=sc.nextInt();
        int[] nums1=new int[m];
        int[] nums2=new int[n];

        for(int i=0;i<m;i++){
            nums1[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++){
            nums1[i]=sc.nextInt();
        }
        
        HashSet<Integer> set1 = new HashSet<>();
        HashSet<Integer> set2 = new HashSet<>();
        
        for (int num : nums1) {
            set1.add(num);
        }
        
        for (int num : nums2) {
            set2.add(num);
        }
        
        set1.retainAll(set2);
        
        int[] ans = new int[set1.size()];
        int i = 0;
        
        for (int num : set1) {
            ans[i++] = num;
        }

        System.out.println(Arrays.toString(ans));
    }
}