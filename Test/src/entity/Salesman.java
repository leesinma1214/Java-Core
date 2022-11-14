package entity;

import java.util.Scanner;

public class Salesman extends Person implements Inputable{
    private static int AUTO_ID = 999;
    private int maNV;
    private String conTime;

    public static int getAutoMaNV() {
        return AUTO_ID;
    }

    public static void setAutoMaNV(int autoMaNV) {
        AUTO_ID = autoMaNV;
    }

    public int getMaNV() {
        return maNV;
    }

    public void setId(int maNV) {
        this.maNV = maNV;
    }

    public String getConTime() {
        return conTime;
    }

    public void setConTime(String name) {
        this.conTime = conTime;
    }

    public void inputInfo() {
        AUTO_ID++;
        this.maNV = AUTO_ID;
        System.out.print("Nhập ngày ký hợp đồng của nhân viên: ");
        this.conTime = new Scanner(System.in).nextLine();
    }
}
