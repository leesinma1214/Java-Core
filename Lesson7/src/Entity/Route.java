package Entity;

import java.util.Scanner;

public class Route implements Inputable{
    public static int AUTO_ID = 100;

    private int routeId;
    private double distance;
    private int stopNum;

    public int getRouteId() {
        return routeId;
    }

    public void setRouteId(int routeId) {
        this.routeId = routeId;
    }

    public double getDistance() {
        return distance;
    }

    public void setDistance(double distance) {
        this.distance = distance;
    }

    public int getStopNum() {
        return stopNum;
    }

    public void setStopNum(int stopNum) {
        this.stopNum = stopNum;
    }

    @Override
    public String toString() {
        return "Route{" +
                "routeId=" + routeId +
                ", distance=" + distance +
                ", stopNum=" + stopNum +
                '}';
    }

    @Override
    public void inputInfo() {
        this.routeId = AUTO_ID;
        AUTO_ID++;

    }
}
