#include<iostream>
using namespace std;

  bool isPowerOfTwo(int n) {
    return n < 0 ? false : __builtin_popcountll(n) == 1;
  }
int main(){
    int x;
    cin>>x;
    bool result=isPowerOfTwo(x);
    cout<<result;

    return 0;
}