import java.util.Scanner;

public class bai6 {
    public static void main(String[] args) {
 
        int n;
        int tong;

        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Nhập vào số nguyên dương bất kỳ: ");
            n = sc.nextInt();
        }
             
        for(tong = 0; n != 0; n = n/10)  
            {  
                tong = tong + n % 10;  
            }  
        System.out.println("Tổng các chữ số = " + tong);    
    }                    
}

