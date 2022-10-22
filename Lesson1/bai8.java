public class bai8 {
    public static void main(String[]args) {
        System.out.println("Cho 3 so 3, 5, 6");
        int n1 = 3, n2 = 5, n3 = 6;

        System.out.println("So lon nhat la: " + Math.max(Math.max(Math.max(n1,n2),Math.max(n3,n2)), n3));
    }
}
