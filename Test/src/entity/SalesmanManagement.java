package entity;

import java.util.Arrays;

public class SalesmanManagement {

    private Salesman salesman;
    private SalesmanDetail[] salesmanDetails;
    private int totalSalesman;

    public SalesmanManagement(Salesman salesman, SalesmanDetail[] salesmanDetails) {
        this.salesman = salesman;
        this.salesmanDetails = salesmanDetails;
    }

    public Salesman getSalesman() {
        return salesman;
    }

    public void setSalesman(Salesman salesman) {
        this.salesman = salesman;
    }

    public SalesmanDetail[] getSalesmanDetails() {
        return salesmanDetails;
    }

    public void setPostDetails(SalesmanDetail[] salesmanDetails) {
        this.salesmanDetails = salesmanDetails;
    }

    public int getTotalSalesman() {
        return totalSalesman;
    }

    public void setTotalPost(int totalPost) {
        this.totalSalesman = totalSalesman;
    }

    @Override
    public String toString() {
        return "PostManagement{" +
                "salesman=" + salesman +
                ", postDetails=" + Arrays.toString(salesmanDetails) +
                '}';
    }
}
