public class Bai2 {
    public static void main(String[] args) {
        System.out.println("Ket qua:");
        for (int i = 1000001; i < 10000000; i+=2) {
            if (caua(i) && caub(i) && cauc(i)) {
                System.out.println(i);
            }
        }
    }

    public static boolean caua(int n) {
        for (int i = 2; i < Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static boolean caub(int n) {
        int[] a = {2, 3, 5, 7};
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
        int reverse = 0;
        while (n > 0) {
            reverse = reverse * 10 + n % 10;
            n = n / 10;
        }

        for (int i = 2; i < reverse; i++) {
            if (reverse % i == 0) {
                return false;
            }
        }
        return true;
    }
}

