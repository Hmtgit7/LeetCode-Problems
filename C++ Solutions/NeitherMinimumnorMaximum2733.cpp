#include<iostream>
#include<vector>
#include<bits/stdc++.h>
using namespace std;


  int findNonMinOrMax(vector<int>& nums) {
    if (nums.size() < 3)
      return -1;
    sort(nums.begin(), nums.begin() + 3);
    return nums[1];
  }
int main(){
    vector<int> nums{3,2,1,4};
    findNonMinOrMax(nums);
    return 0;
}