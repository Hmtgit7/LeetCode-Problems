#include <bits/stdc++.h>
using namespace std;
vector<bool> prefixesDivBy5(vector<int> &nums)
{
    vector<bool> res;
    int num = nums[0];
    bool dBFive = num % 5 == 0 ? true : false;
    res.push_back(dBFive);
    for (int i = 1; i < nums.size(); i++)
    {
        if (nums[i] == 1)
        {
            num = num * 2 + 1;
        }
        else
        {
            num = num * 2;
        }
        if (num % 5 == 0)
            res.push_back(true);
        if (num % 5 != 0)
            res.push_back(false);
        num = num % 5;
    }
    return res;
}
vector<bool> prefixesDivBySecond5(vector<int>& nums) {
    vector<bool> ans;
    int curr = 0;

    for (const int num : nums) {
      curr = (curr * 2 + num) % 5;
      ans.push_back(curr % 5 == 0);
    }

    return ans;
  }
int main()
{
    vector<int> nums = {0, 1, 1, 1, 1, 1};
    vector<bool> res = prefixesDivBy5(nums);
    for (int i = 0; i < res.size(); i++)
    {
        cout << res[i] << " ";
    }
    return 0;
}