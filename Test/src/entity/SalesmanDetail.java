package entity;

public class SalesmanDetail {

    Salesman salesman;
    int quantity;

    public SalesmanDetail(Salesman salesman, int quantity) {
        this.salesman = salesman;
        this.quantity = quantity;
    }

    public Salesman getSalesman() {
        return salesman;
    }

    public void setSalesman(Salesman salesman) {
        this.salesman = salesman;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return "PostDetail{" +
                "salesman=" + salesman +
                ", quantity=" + quantity +
                '}';
    }

}
