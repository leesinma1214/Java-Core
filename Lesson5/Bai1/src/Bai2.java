import java.util.Scanner;

public class Bai2 {
    public static void main(String[] args) {

        System.out.print("So sinh vien muon them moi: ");
        int numSinhvien = new Scanner(System.in).nextInt();
        Sinhvien[] sinhvienarr = new Sinhvien[numSinhvien];

        for (int i = 0; i < numSinhvien; i++) {
            sinhvienarr[i] = new Sinhvien();
            sinhvienarr[i].inputInfo();
        }

        System.out.println("Danh sach sinh vien hien tai: ");
        for (int i = 0; i < numSinhvien; i++) {
            sinhvienarr[i].outputInfo();
        }
        System.out.println(" ");

        System.out.println("Sap xep theo ten sinh vien: ");
        Sinhvien temp;
        for (int i = 0; i < numSinhvien; i++) {
            for (int j = 0; j < numSinhvien; j++) {
                if (sinhvienarr[i].name.compareToIgnoreCase(sinhvienarr[j].name) < 0) {
                    temp = sinhvienarr[i];
                    sinhvienarr[i] = sinhvienarr[j];
                    sinhvienarr[j] = temp;
                }
            }
        }
        for (int i = 0; i < numSinhvien; i++) {
            sinhvienarr[i].outputInfo();
        }
        System.out.println(" ");

        System.out.println("Sap xep sinh vien theo lop: ");
        Sinhvien temp1;
        for (int i = 0; i < numSinhvien; i++) {
            for (int j = 0; j < numSinhvien; j++) {
                if (sinhvienarr[i].Class.compareToIgnoreCase(sinhvienarr[j].Class) < 0) {
                    temp1 = sinhvienarr[i];
                    sinhvienarr[i] = sinhvienarr[j];
                    sinhvienarr[j] = temp1;
                }
            }
        }
        for (int i = 0; i < numSinhvien; i++) {
            sinhvienarr[i].outputInfo();
        }
        System.out.println(" ");
    }
}

