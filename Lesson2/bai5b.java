import java.util.Scanner;

public class bai5b {
    public static void main(String[] args){
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Nhap vao xau ki tu s: ");
            String s = sc.nextLine();
            System.out.println("Nhap vao xau ki tu s1: ");
            String s1 = sc.nextLine();
            System.out.println("Nhap vao xau ki tu s2: ");
            String s2 = sc.nextLine();

            String replaceString = s.replace(s1, s2);

            System.out.println("Ket qua: " + "\"" + replaceString + "\"");
        }
    }
}
