import java.util.Scanner;

public class bai3 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            
            int uscln = 1;

            System.out.print("Nhập số nguyên dương a: ");
            int a = sc.nextInt();
            System.out.print("Nhập số nguyên dương b: ");
            int b = sc.nextInt();

            for(int i = 1; i <= a && i <= b; i++)
            {
                if(a % i == 0 && b % i == 0)
                    uscln = i;
            }
            
            int bscnn = (a * b) / uscln;

            System.out.println("Ước chung lớn nhất của " + a + " và " + b + " là: " + uscln);
            System.out.println("Bội chung nhỏ nhất của " + a + " và " + b + " là: " + bscnn);
        
        }
    }
}