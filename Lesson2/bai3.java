import java.util.Scanner;

public class bai3 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Tinh dien tich va chu vi hinh chu nhat");
            System.out.println("Nhap chieu dai: ");
            float a = sc.nextFloat();
            System.out.println("Nhap chieu rong: ");
            float b = sc.nextFloat();    
            
            
            System.out.println("Chu vi hinh chu nhat la: " + ((a+b)*2));
            System.out.println("Dien tich hinh chu nhat la: " + (a*b));
        }
    }
}
