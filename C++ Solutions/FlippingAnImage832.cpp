#include <bits/stdc++.h>

using namespace std;

vector<vector<int>> flipAndInvertImage(vector<vector<int>> &image)
{
    const int n = image.size();

    for (int i = 0; i < n; ++i)
        for (int j = 0; j < (n + 1) / 2; ++j)
        {
            const int temp = image[i][j] ^ 1;
            image[i][j] = image[i][n - j - 1] ^ 1;
            image[i][n - j - 1] = temp;
        }
    return image;
}
int main()
{
    vector<vector<int>> image = {{1, 1, 0}, {1, 0, 1}, {0, 0, 0}};
    vector<vector<int>> ans = flipAndInvertImage(image);

    for (int i = 0; i < ans.size(); i++)
    {
        for (int j = 0; j < ans[i].size(); j++)
        {
            cout << ans[i][j] << " ";
        }
        cout << endl;
    }
    
    return 0;
}