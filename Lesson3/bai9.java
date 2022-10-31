import java.util.Scanner;

public class bai9 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int hight;
            System.out.printf("\n\nNhập vào chiều cao của tam giác: ");
            hight = sc.nextInt();
            for (int i = 1; i <= hight; ++i) {
                for (int j = 1; j <= i; ++j) {
                    System.out.print("* ");
                }
                System.out.println();
            }
        }
    }
}
