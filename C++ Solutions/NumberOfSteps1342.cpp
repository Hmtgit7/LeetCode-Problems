#include <iostream>
using namespace std;

int count(int num , int steps){
    if(num==0) return steps;
    if(num%2==0) return count(num/2,steps+1);
    return count(num-1,steps+1);
}
int numberOfSteps(int num)
{
    return count(num,0);
}

int main()
{
    int num=234;
    int result=numberOfSteps(num);
    cout<<result;
    return 0;
}

/* SECOND SOLUTION*/
/*
int numberOfSteps(int num)
{
    int steps = 0;
    while(num > 0) {
        num = num % 2 == 0 ? num / 2 : --num;
        steps++;
    }
    return steps;
}
*/