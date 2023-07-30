#include<iostream>
using namespace std;

bool isPerfectSquare(int num) {
    long long lnum = num;
        for(long long i = 1; i * i <= lnum; i++){
            if(i * i == lnum) return true;
        }
        return false;
    }
int main(){
    int n;
    cin>>n;
    // bool result=isPerfectSquare(n);
    // cout<<result;
    cout<<isPerfectSquare(n);

    return 0;
}