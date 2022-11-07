import java.util.Scanner;

public class Bai6 {
    public static void main(String[] args) {
        System.out.print("Nhap so phan tu cua mang: ");
        int n = new Scanner(System.in).nextInt();
        System.out.println("Nhap hai so nguyen (So thu hai lon hon so thu nhat)");
        System.out.print("Nhap so thu nhat: ");
        int b = new Scanner(System.in).nextInt();
        System.out.print("Nhap so thu hai: ");
        int c = new Scanner(System.in).nextInt();
        System.out.println("Ket qua: " + caculate(inputArr(n), b, c));
    }

    public static int[] inputArr(int n) {
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Nhap phan tu thu " + (i+1) + " cua mang: ");
            arr[i] = new Scanner(System.in).nextInt();
        }
        return arr;
    }

    public static double caculate(int[] arr, int b, int c) {
        double S = 0;
        double count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] >= b && arr[i] <= c) {
                S = S + arr[i];
                count += 1;
            }
        }
        return S / count;
    }
}