/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class CoupleGame
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
        Scanner read=new Scanner(System.in);
		int n=read.nextInt();
        while(n>0){
            int G=read.nextInt();
            int B=read.nextInt();
            int result=B-G;
            System.out.println(result);
            --n;
        }
	}
}
