import java.util.Scanner;

public class Bai4 {
    public static void main(String[] args) {
        System.out.print("Nhap so phan tu cua mang: ");
        int n = new Scanner(System.in).nextInt();
        System.out.println("So cap phan tu lien tiep ban nhau trong day la "+ count(inputArr(n)) );
    }

    public static int[] inputArr(int n) {
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Nhap phan tu thu " + (i+1) + ": ");
            arr[i] = new Scanner(System.in).nextInt();
        }
        return arr;
    }

    public static int count(int[] arr) {
        int t = 0;
        for (int i = 0; i < arr.length-1; i++) {
            if(arr[i]==arr[i+1]) {
                t+=1;
            }
        }
        return t;
    }
}