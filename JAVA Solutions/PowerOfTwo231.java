import java.util.Scanner;

public class PowerOfTwo231 {
    public static void main(String[] args) {
        Scanner read=new Scanner(System.in);
        int X=read.nextInt();
        System.out.println(isPowerOfTwo(X)); 
        read.close();
    }
    public static boolean isPowerOfTwo(int n) {
        return n < 0 ? false : Integer.bitCount(n) == 1;
      }
}
