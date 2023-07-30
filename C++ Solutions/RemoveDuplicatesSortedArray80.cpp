#include<bits/stdc++.h>
using namespace std;

class Solution {
public:
    int removeDuplicates(vector<int>& nums) {
        int i = 0;
        for (int it = 0; it < nums.size(); it++) {
            if (i == 0 || i == 1 || nums[i - 2] != nums[it]) {
                nums[i] = nums[it];
                i++;
            }
        }
        return i;
    }
};
int main(){
    vector<int> nums={0,0,1,1,1,1,2,3,3};
    Solution s1;
    int res=s1.removeDuplicates(nums);
    cout<<res;
    return 0;
}