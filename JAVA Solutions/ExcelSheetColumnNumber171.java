import java.util.Scanner;

public class ExcelSheetColumnNumber171 {
    public static void main(String[] args) {
        Scanner read=new Scanner(System.in);
        String columnTitle=read.nextLine();
        System.out.println(titleToNumber(columnTitle));
        read.close();
    }
    static int titleToNumber(String columnTitle) {
        int result=0;
        for(int i=0;i<columnTitle.length();i++){
            result=result*26;
            result=result+(columnTitle.charAt(i)-'A'+1);
        }  
        return result;
    }
}
