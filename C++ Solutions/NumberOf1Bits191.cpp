#include<bits/stdc++.h>
using namespace std;


class Solution {
 public:
  int hammingWeight(uint32_t n) {
    int ans = 0;
    for (int i = 0; i < 32; ++i)
      if ((n >> i) & 1)
        ++ans;
    return ans;
  }
};
int main(){
    int n=00000000000000000000000000001011;
    Solution s1;
    int n=s1.hammingWeight(n);
    cout<<n;
    return 0;
}