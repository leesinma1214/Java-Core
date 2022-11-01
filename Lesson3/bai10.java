import java.util.Scanner;

public class bai10 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int cao, k = 0;
            System.out.print("Nhập vào chiều cao của kim tự tháp: ");
            cao = sc.nextInt();
            for (int i = 1; i <= cao; ++i, k = 0) {
                for (int sp = 1; sp <= cao - i; ++sp) {
                    System.out.print("  ");
                }
                while (k != 2 * i - 1) {
                    System.out.print("* ");
                    ++k;
                }
                System.out.println();
            }
        }
    }
}
