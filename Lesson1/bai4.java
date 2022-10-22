public class bai4 {
    public static void main(String[]args) {
        System.out.println("Cho mot so nguyen duong: 5");
        int a = 3;
        double b = Math.sqrt(a);
        System.out.println("Can bac hai cua so nguyen duong la: " + b);
        System.out.println("Can bac hai cua so nguyen duong da duoc lam tron la: " + ((double) Math.round(b * 1000) / 1000));
    }
}