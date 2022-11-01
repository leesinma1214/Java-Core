import java.util.Scanner;

public class bai8 {
    public static void main(String[] args) {
         
        int dai;
        int rong;
        int i;
        
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Nhập chiều dài = ");
            dai = sc.nextInt();
 
            System.out.print("Nhập chiều rộng = ");
            rong = sc.nextInt();  
            for(i = 1; i <= dai; i++){
                for(int j = 1; j <= rong; j++) {
                    if(i == 1 || i == dai || j == 1 || j == rong)
                        System.out.print("*  ");
                    else
                        System.out.print("   ");
                }
                System.out.println("");
            }
        }
    }
}
