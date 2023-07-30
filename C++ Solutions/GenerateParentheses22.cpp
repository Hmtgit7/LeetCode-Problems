#include<iostream>
#include<bits/stdc++.h>
using namespace std;

  vector<string> generateParenthesis(int n) {
    vector<string> ans;
    dfs(n, n, "", ans);
    return ans;
  }
  void dfs(int l, int r, string&& path, vector<string>& ans) {
    if (l == 0 && r == 0) {
      ans.push_back(path);
      return;
    }

    if (l > 0) {
      path.push_back('(');
      dfs(l - 1, r, move(path), ans);
      path.pop_back();
    }
    if (l < r) {
      path.push_back(')');
      dfs(l, r - 1, move(path), ans);
      path.pop_back();
    }
  }

  int main(){
    int n;
    cin>>n;
    vector<string>ans=generateParenthesis(n);
    for (int pair:ans){
      cout<<pair;
    }
    return 0;
  }
