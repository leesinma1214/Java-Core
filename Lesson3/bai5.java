import java.util.Scanner;

public class bai5 {
    private static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.print("Nhập số nguyên dương n = ");
        int n = scanner.nextInt();
        System.out.println(n + " là số thuận nghịch: " + isThuanNghich(n));
    }
      
    public static boolean isThuanNghich(int n) {
        
        String numberStr = String.valueOf(n);
        
        int size = numberStr.length();
        for (int i = 0; i < (size/2); i++) {
            if (numberStr.charAt(i) != numberStr.charAt(size - i - 1)) {
                return false;
            }
        }
        return true;
    }
}
