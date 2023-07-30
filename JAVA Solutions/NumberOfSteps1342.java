public class NumberOfSteps1342 {
    public static void main(String[] args) {
        int num=234;
        int step=numberOfSteps(num);
        System.out.println(step);
    }
    public static int numberOfSteps(int num) {
        return count(num,0);
    }
    public static int count(int num, int steps){
        if(num==0) return steps;
        if(num%2==0) return count(num/2, steps+1);
        return count(num-1,steps+1);
    }
}


/* ALTERNATE SOLUTION */
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