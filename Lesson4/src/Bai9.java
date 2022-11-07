import java.util.Scanner;

public class Bai9 {
    public static void main(String[] args) {
        System.out.print("Nhap so phan tu cua mang: ");
        int n = new Scanner(System.in).nextInt();
        findDiff(inputArr(n));
    }


    public static int[] inputArr(int n) {
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Nhap phan tu thu " + (i+1) + " cua mang: ");
            arr[i] = new Scanner(System.in).nextInt();
        }
        return arr;
    }

    public static void findDiff(int[] arr) {
        System.out.print("Cac so khac nhau trong chuoi la: ");
        boolean t = false;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (arr[i] == arr[j] && j != i) {
                    t = true;
                    break;
                }
            }
            if (t == false) {
                System.out.print(arr[i] + "\t");
            }
            t = false;
        }

    }

}