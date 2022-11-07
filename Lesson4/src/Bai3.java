import java.util.Scanner;

public class Bai3 {
    public static void main(String[] args) {
        System.out.print("Nhap so phan tu cua mang: ");
        int n = new Scanner(System.in).nextInt();
        outputArr(reAlign(inputArr(n)));
    }

    public static int[] inputArr(int n) {
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Nhap phan tu thu " + (i+1) + ": ");
            arr[i] = new Scanner(System.in).nextInt();
        }
        return arr;
    }

    public static int[] reAlign(int[] arr) {
        int temp;
        for (int i = 1; i < arr.length; i++) {
            for (int j = 0; j < arr.length - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        return arr;
    }

    public static void outputArr(int[] arr) {
        System.out.println("Sap xep theo thu tu tang dan: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "\t");
        }
    }

}