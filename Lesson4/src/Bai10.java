import java.util.Scanner;

public class Bai10 {
    public static void main(String[] args) {
        System.out.print("Nhap so phan tu cua mang: ");
        int n = new Scanner(System.in).nextInt();
        outputArr(diffArr(n));
    }

    public static int[] diffArr(int n) {
        int[] arr = new int[n];
        int i = 0;
        boolean same;
        while (i < n) {
            System.out.print("Nhap phan tu thu " + (i+1) + " cua mang: ");
            arr[i] = new Scanner(System.in).nextInt();

            same = false;
            for (int j = 0; j < i; j++) {
                if (arr[j] == arr[i]) {
                    same = true;
                    break;
                }
            }

            if (same) {
                System.out.println("Nhap lai phan tu thu " + (i+1));
            } else {
                i += 1;
            }
        }
        return arr;
    }

    public static void outputArr(int[] arr) {
        System.out.println("Ket qua ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "\t");
        }
    }
}