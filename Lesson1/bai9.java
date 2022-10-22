public class bai9 {
    public static void main(String[]args) {
        System.out.println("Cho 2 so nguyen duong: 1 va 9");

        double a = 1;
        double b = 9;
        double c = a/b;

        System.out.println("Can bac hai cua so nguyen duong da duoc lam tron la: " + ((double) Math.round(c * 1000) / 1000));
    }
}
