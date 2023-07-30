public class ValidPerfectSquare367{
    public static void main(String[] args) {

    }
    public boolean isPerfectSquare(int num) {
        if (num == 0 || num == 1) {
             return true;
         }
 
         int l = 1, h = num;
 
         // binary search for mid*mid
         while (l <= h) {
             int mid = l + (h - l) / 2;
             if (mid == num / mid && num % mid == 0) {
                 return true;
             }
             else if (mid < num / mid) {
                 l = mid + 1;
             }
             else {
                 h = mid - 1;
             } 
     }
     return false;
 }
}