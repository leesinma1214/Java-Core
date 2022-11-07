import java.util.Scanner;

public class Bai8 {
    public static void main(String[] args) {
        System.out.print("Nhap so phan tu cua mang: ");
        int n = new Scanner(System.in).nextInt();
        int[] Array = inputArr(n);
        System.out.print("So phan tu suat hien nhieu nhat trong mang la: " + mostRepeated(Array));
    }

    public static int[] inputArr(int n) {
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Nhap phan tu thu " + (i+1) + " cua mang: ");
            arr[i] = new Scanner(System.in).nextInt();
        }
        return arr;
    }

    public static int mostRepeated(int[] arr) {
        int num = 0;
        int count = 0;
        int countMark = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    count += 1;
                }
            }
            if (count > countMark) {
                countMark = count;
                num = arr[i];
            }
            count = 0;
        }
        return num;
    }
}