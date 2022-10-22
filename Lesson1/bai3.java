public class bai3 {
    public static void main(String[]args) {
        System.out.println("Cho 4 so 3, 5, 6 ,8");
        int n1 = 3, n2 = 5, n3 = 6 ,n4 = 8;

        System.out.println("So lon nhat la: " + Math.max(Math.max(Math.max(n1,n2),Math.max(n3,n4)), n4));
    }
}
