import java.util.Scanner;

public class bai6 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Tinh dien tich cua hinh tron");
            System.out.println("Nhap ban kinh: ");
            float a = sc.nextFloat();   
            System.out.println("Dien tich cua hinh tron la: " + (a*a*Math.PI));
        }
    }
}
