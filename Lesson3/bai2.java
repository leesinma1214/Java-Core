import java.util.Scanner;

public class bai2 {
    public static void main(String[] args) {
         
        int n;
        int count = 0;
        Scanner sc;
        do {
            System.out.print("Nhập n: ");
            sc = new Scanner(System.in);
            n = sc.nextInt();
        }while(n <= 0);
         
         
        System.out.println("Các ước số của " + n + ":");
        for(int i = 1; i <= n; i++) {
            if(n%i == 0) {
                System.out.print(i + " ");
                count++;
            }
        }
        System.out.println("\nCó "+count+" ước");
            
        sc.close();
    }
}
