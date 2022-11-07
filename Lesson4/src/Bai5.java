import java.util.Scanner;

public class Bai5 {
    public static void main(String[] args) {
        System.out.print("Nhap so phan tu cua mang: ");
        int n = new Scanner(System.in).nextInt();
        int[] arr = inputArr(n);
        System.out.println("Sap xep chuoi theo thu tu giam dan: ");
        outputArr(reAlignArr(arr));
        secondBig(reAlignArr(arr));
    }

    public static int[] inputArr(int n) {
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Nhap phan tu thu " + (i+1) + ": ");
            arr[i] = new Scanner(System.in).nextInt();
        }
        return arr;
    }

    public static int[] reAlignArr(int[] arr) {
        int temp;
        for (int i = 1; i < arr.length; i++) {
            for (int j = 0; j < arr.length - i; j++) {
                if (arr[j] < arr[j + 1]) {
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        return arr;
    }

    public static void outputArr(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "\t");
        }
    }
    
    public static void secondBig(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < arr[i - 1]) {
                System.out.println("\nSo lon nhat thu hai trong chuoi la: " + arr[i]);
                return;
            }
        }
        System.out.println("\nKhong co so thu hai lon nhat");
    }
}