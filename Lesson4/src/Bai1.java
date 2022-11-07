public class Bai1 {
    public static void main(String[] args) {
        System.out.println("Ket qua:");
        for (int i = 1000000; i < 1000000000; i++) {
            if (caua(i) && caub(i) && cauc(i)) {
                System.out.println(i);
            }
        }
    }

    public static boolean caua(int n) {
        int n1 = n;
        int res = 0;
        while (n > 0) {
            res = res * 10 + n % 10;
            n = n / 10;
        }
        return res == n1;
    }

    public static boolean caub(int n) {
        int[] a = {0, 6, 8};
        boolean check = false;
        while (n > 0) {
            for (int j = 0; j < a.length; j++) {
                check = false;
                if (a[j] == n % 10) {
                    check = true;
                    break;
                }
            }

            if (!check) {
                return check;
            }
            n /= 10;
        }
        return check;
    }

    public static boolean cauc(int n) {
        int S = 0;
        while (n > 0) {
            S += n % 10;
            n /= 10;
        }
        return S % 10 == 0;
    }

}