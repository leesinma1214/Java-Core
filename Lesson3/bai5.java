import java.util.Scanner;

public class bai5 {
    public static void main(String[] args) {
        
        try (Scanner sc = new Scanner(System.in)) {
            int num1,num2, reversed = 0;
            System.out.println("Nhập vào số: ");
            num1 = sc.nextInt();
            num2 = num1;
            
            while(num1 != 0) {
            int digit = num1 % 10;
            reversed = reversed * 10 + digit;
            num1 /= 10;

            }
            if (reversed == num2)
                System.out.println("La so thuan nghich");
            else
                System.out.println("Khong phai so thuan nghich");
        }
    }
}
