#include<iostream>
using namespace std;

int titleToNumber(string columnTitle) {
        int result=0;
        for(int i=0;i<columnTitle.size();i++){
            result=result*26;
            result=result+(columnTitle[i]-'A'+1);
        }  
        return result;
    }
int main(){
    string s;
    cin>>s;
    cout<<titleToNumber(s);
    return 0;
}