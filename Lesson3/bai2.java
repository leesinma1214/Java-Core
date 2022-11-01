import java.util.Scanner;

public class bai2 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            
            int n;
            int count = 0;

            System.out.print("Nhập n: ");
            n = sc.nextInt();

            for(int i = 1; i <= n; i++) {
                if(n%i == 0) {
                    System.out.print(i + " ");
                    count++;
                }
            }
            System.out.println("\nCó "+count+" ước");
        }
    }
}
