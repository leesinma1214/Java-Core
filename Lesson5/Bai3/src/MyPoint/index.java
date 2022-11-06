package MyPoint;

import java.util.Scanner;

public class index {
    public static void main(String[] args) {
        System.out.print("Nhap so diem muon tao: ");
        int n = new Scanner(System.in).nextInt();

        MyPoint[] points = new MyPoint[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Nhap toa do diem thu: " + (i + 1));
            System.out.print("Nhap toa do x: ");
            double x = new Scanner(System.in).nextDouble();
            System.out.print("Nhap toa do y: ");
            double y = new Scanner(System.in).nextDouble();
            points[i] = new MyPoint(x, y);
            System.out.println(" ");
        }

        System.out.println("Toa do cac diem da tao");
        for (int i = 0; i < n; i++) {
            System.out.println("Diem " + (i + 1) + " (" + points[i].x + "," + points[i].y + ")");
        }
        System.out.println(" ");

        System.out.print("Hai diem co khoang cach lon nhat: ");
        double maxdistance = 0;
        MyPoint pointA = null;
        MyPoint pointB = null;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (points[i].distance(points[i], points[j]) >= maxdistance) {
                    maxdistance = points[i].distance(points[i], points[j]);
                    pointA = points[i];
                    pointB = points[j];
                }
            }
        }
        System.out.println("(" + pointA.x + "," + pointA.y + ") va (" + pointB.x + "," + pointB.y + ")");
        System.out.println("Gia tri khoang cach do la "+maxdistance);
    }
}


