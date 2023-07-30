class Solution {
public:
    int maximumWealth(vector<vector<int>>& accounts) {
        int min=INT_MIN;
        for(int r=0; r<accounts.size(); r++){
            int rowSum=0;
            for(int c=0;c<accounts[r].size();c++){
                rowSum+=accounts[r][c];    
            }
            if(rowSum>min){
                min=rowSum;
            }
        }
        return min;   
    }
};