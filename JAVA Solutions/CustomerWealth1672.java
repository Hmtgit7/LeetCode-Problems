class Solution1 {
    public int maximumWealth(int[][] accounts) {
        int min=Integer.MIN_VALUE;
        for(int[] r:accounts){
            int rowSum=0;
            for(int c:r){
                rowSum+=c;    
            }
            if(rowSum>min){
                min=rowSum;
            }
        }
        return min;
    }
}
/* second method using normal for loop */

class Solution2 {
    public int maximumWealth(int[][] accounts) {
        int min=Integer.MIN_VALUE;
        for(int[] r:accounts){
            int rowSum=0;
            for(int c:r){
                rowSum+=c;    
            }
            if(rowSum>min){
                min=rowSum;
            }
        }
        return min;
    }
}