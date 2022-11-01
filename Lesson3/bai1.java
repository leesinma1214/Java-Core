import java.util.Scanner;

public class bai1 {
    public static void main(String[] args) {
        int num1, num2, num3, num4;
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Nhập vào số thứ nhất: ");
            num1 = sc.nextInt();
            System.out.print("Nhập vào số thứ hai: ");
            num2 = sc.nextInt();
            System.out.print("Nhập vào số thứ ba: ");
            num3 = sc.nextInt();
            System.out.print("Nhập vào số thứ tư: ");
            num4 = sc.nextInt();
            System.out.println("--------------------------------");
        }
        if( num1 >= num2 && num1 >= num3 && num1 >= num4)
            System.out.println(num1+" là số lớn nhất");
 
        else if (num2 >= num1 && num2 >= num3 && num2 >= num4)
            System.out.println(num2+" là số lớn nhất");

        else if (num3 >= num1 && num3 >= num2 && num3 >= num4)
            System.out.println(num3+" là số lớn nhất");

        else
            System.out.println(num4+" là số lớn nhất");
    }
}
