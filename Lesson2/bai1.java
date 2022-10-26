import java.util.Scanner;

public class bai1 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Giai phuong trinh bac 1 ax+b=0");
            System.out.println("Nhap a: ");
            float a = sc.nextFloat();
            System.out.println("Nhap b: ");
            float b = sc.nextFloat();    
            
            String kq = "Phuong trinh co mot nghiem: " + "x = " + (-b / a);
            kq = (a == 0 & b == 0) ? "Phuong trinh co vo so nghiem" : kq;
            kq = (a == 0 & b != 0) ? "Phuong trinh vo nghiem" : kq;
            System.out.println(kq);
        }
    }
}
