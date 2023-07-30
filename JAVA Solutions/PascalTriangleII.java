import java.util.Arrays;
import java.util.Scanner;

public class PascalTriangleII {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int rowIndex = sc.nextInt();
        sc.close();
        Integer[] ans = new Integer[rowIndex + 1];
        Arrays.fill(ans, 1);

        for (int i = 2; i < rowIndex + 1; ++i)
            for (int j = 1; j < i; ++j)
                ans[i - j] += ans[i - j - 1];
        System.out.println(Arrays.asList(ans));
    }
}