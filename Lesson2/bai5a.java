import java.util.Scanner;

public class bai5a {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Nhap vao mot chuoi bat ki: ");
            String stringg = sc.nextLine();
            System.out.println("Nhap vao mot ki tu bat ki: ");
            String character = sc.nextLine();
            System.out.println("Vi tri xuat hien dau tien cua ki tu " + "\"" + character + "\"" + " la: "  + (stringg.indexOf(character)+1) + " (tu trai sang phai)");
            System.out.println("Vi tri xuat hien cuoi cung cua ki tu " + "\"" + character  + "\"" + " la: " + (stringg.lastIndexOf(character)+1) + " (tu trai sang phai)");
        }      
    }
}
