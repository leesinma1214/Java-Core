import java.util.Scanner;

public class Bai7 {
    public static void main(String[] args) {
        System.out.print("Nhap so phan tu cua mang: ");
        int n = new Scanner(System.in).nextInt();
        int[] mainArr = inputArr(n);
        if(checkRevArr(mainArr, reverseArr(mainArr,n))) {
            System.out.println("Day la mang doi xung");
        }
        else {
            System.out.println("Day khong phai la mang doi xung");
        }
    }

    public static int[] inputArr(int n) {
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Nhap phan tu thu " + (i+1) + " cua mang: ");
            arr[i] = new Scanner(System.in).nextInt();
        }
        return arr;
    }

    public static int[] reverseArr(int[] mainArr, int n) {
        int[] reverseArr = new int[n];
        for (int i = 0; i < mainArr.length; i++) {
            reverseArr[i] = mainArr[mainArr.length - 1 - i];
        }
        return reverseArr;
    }

    public static boolean checkRevArr(int[] mainArr, int[] reverseArr) {
        for (int i = 0; i < mainArr.length; i++) {
            if (mainArr[i] != reverseArr[i]) {
                return false;
            }
        }
        return true;
    }
}
