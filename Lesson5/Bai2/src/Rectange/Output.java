package Rectange;

import java.util.Scanner;

public class Output {
    public static void main(String[] args) {
        System.out.print("Nhap chieu dai hinh chu nhat: ");
        double width = new Scanner(System.in).nextDouble();
        System.out.print("Nhap chieu rong hinh chu nhat: ");
        double height = new Scanner(System.in).nextDouble();
        System.out.print("Nhap mau cua hinh chu nhat: ");
        String color = new Scanner(System.in).nextLine();

        Rectange rect = new Rectange(width,height,color);

        System.out.println(" ");
        System.out.println("Hinh chu nhat co:");
        System.out.println("Chieu dai: " + rect.width);
        System.out.println("Chieu rong: " + rect.height);
        System.out.println("Mau: " + rect.color);
        System.out.println("Dien tich: "+rect.findArea());
        System.out.println("Chu vi: "+rect.findPerimeter());
    }
}
