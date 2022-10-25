public class bai9 {
    public static void main(String[]args) {
        System.out.println("Cho 2 so nguyen duong: 1 va 9");

        int a = 1;
        int b = 9;
        double c = (double)a/b;

        System.out.println("Ket qua: " + ((double) Math.round(c * 1000) / 1000));
    }
}
