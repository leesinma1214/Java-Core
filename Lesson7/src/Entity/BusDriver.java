package Entity;

import Constant.BusDriverLevel;

import java.util.Scanner;

public class BusDriver extends Person {
    public static int AUTO_ID = 10000;

    private int driverId;
    private String driveLevel;

    public int getDriverId() {
        return driverId;
    }

    public void setDriverId(int driverId) {
        this.driverId = driverId;
    }

    public String getDriveLevel() {
        return driveLevel;
    }

    public void setDriveLevel(String driveLevel) {
        this.driveLevel = driveLevel;
    }

    @Override
    public String toString() {
        return "BusDriver{" +
                "driverId=" + driverId +
                ", driveLevel='" + driveLevel + '\'' +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", phone='" + phone + '\'' +
                '}';
    }

    public void inputInfo() {
        this.driverId = AUTO_ID;
        AUTO_ID++;
    }
}
