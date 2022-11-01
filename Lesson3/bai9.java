import java.util.Scanner;

public class bai9 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int cao;
            System.out.print("Nhập vào chiều cao của tam giác: ");
            cao = sc.nextInt();
            for (int i = 1; i <= cao; ++i) {
                for (int j = 1; j <= i; ++j) {
                    System.out.print("* ");
                }
                System.out.println();
            }
        }
    }
}
