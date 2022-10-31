import java.util.Scanner;

public class bai8 {
    public static void main(String[] args) {
         
        int height, width;
        int i;
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Nhập chiều dài = ");
            height = sc.nextInt();
 
            System.out.print("Nhập chiều rộng = ");
            width = sc.nextInt();  
            for(i = 1; i <= height; i++){
                for(int j = 1; j <= width; j++) {
                    if(i == 1 || i == height || j == 1 || j == width)
                        System.out.print("*  ");
                    else
                        System.out.print("   ");
                }
                System.out.println("");
            }
             
            sc.close();
        }
    }
}
