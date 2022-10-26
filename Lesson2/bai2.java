import java.util.Scanner;

public class bai2 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Giai phuong trinh bac 2 ax^2+bx+c=0");
            System.out.println("Nhap a: ");
            float a = sc.nextFloat();
            System.out.println("Nhap b: ");
            float b = sc.nextFloat();    
            System.out.println("Nhap c: ");
            float c = sc.nextFloat();  
            
            float delta = b*b - 4*a*c;
            
            String kq = "Phuong trinh co hai nghiem: " + "x1 = " + ((-b)+Math.sqrt((delta)))/(2*a) + "x2 = " +((-b)-Math.sqrt((delta)))/(2*a) ;
            kq = (delta == 0) ? ("Phuong trinh co mot nghiem: " + "x = " + (-b / (2 * a))): kq;
            kq = (delta < 0) ? "Phuong trinh vo nghiem" : kq;
            kq = (a == 0 & b == 0) ? "Phuong trinh vo nghiem" : kq;
            kq = (a == 0 & b != 0) ? ("Phuong trinh co mot nghiem: " + "x = " + (-c / b)): kq;
            System.out.println(kq);
        }
    }
}
