#include<bits/stdc++.h>
using namespace std;

class Solution {
public:
    //Method 1: Using built-in function
    string convertToBase7(int num) {
        if(num == 0) return "0";
        string ans = "";
        bool neg = false;
        if(num < 0) {
            neg = true;
            num = -num;
        }
        while(num) {
            ans += to_string(num % 7);
            num /= 7;
        }
        if(neg) ans += "-";
        reverse(ans.begin(), ans.end());
        return ans;
    }
    //Method 2: Using recursion
    string convertToBaseSeven(int num) {
        if(num < 0) return "-" + convertToBase7(-num);
        if(num < 7) return to_string(num);
        return convertToBase7(num / 7) + to_string(num % 7);
    }
};

int main(){
    Solution s;
    cout << s.convertToBase7(100) << endl;
    cout << s.convertToBase7(-7) << endl;
    cout << s.convertToBase7(0) << endl;
    cout << s.convertToBaseSeven(7) << endl;
    cout << s.convertToBaseSeven(-7) << endl;
    cout << s.convertToBaseSeven(0) << endl;
    return 0;
}