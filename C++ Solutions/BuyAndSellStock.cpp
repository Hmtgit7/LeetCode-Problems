#include <bits/stdc++.h>
using namespace std;

int maxProfit(vector<int> &prices)
{
    vector<int> max;
    int max_value = 0;
    for (int i = prices.size() - 1; i >= 0; i--)
    {
        if (prices[i] > max_value)
            max_value = prices[i];
        max.push_back(max_value);
    }
    reverse(max.begin(), max.end());
    int ans=0;
    for (int i = 0; i < prices.size(); i++)
    {
        if (max[i] - prices[i] > ans)
            ans = max[i] - prices[i];
    }
    return ans;
}

int main()
{
    vector<int> prices = {7, 1, 5, 3, 6, 4};
    int result = maxProfit(prices);
    cout << result << endl;
    return 0;
}