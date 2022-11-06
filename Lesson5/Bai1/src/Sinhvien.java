import java.util.Scanner;

public class Sinhvien {
    public String id;
    public String name;
    public String Class;
    public String subject;


    public void inputInfo() {
        System.out.print("Nhap ma sinh vien: ");
        this.id = new Scanner(System.in).nextLine();
        System.out.print("Nhap ten sinh vien: ");
        this.name = new Scanner(System.in).nextLine();
        System.out.print("Lop dang hoc: ");
        this.Class = new Scanner(System.in).nextLine();
        System.out.print("Nhap khoa dang hoc: ");
        this.subject = new Scanner(System.in).nextLine();
        System.out.println(" ");
    }

    public void outputInfo() {
        System.out.println("MSV: " + id);
        System.out.println("Ten: " + name);
        System.out.println("Lop: " + Class);
        System.out.println("Khoa: " + subject);
    }
}