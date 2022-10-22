public class bai7 {
    public static void main(String[] args) {
        System.out.println("Phuong trinh ax^2+bx+c=0 co a=2, b=5 va c=3");
        
        double a = 2;
        double b = 5;
        double c = 3;
        double x1 = ((-b)+Math.sqrt((b*b-4*a*c)))/(2*a);
        double x2 = ((-b)-Math.sqrt((b*b-4*a*c)))/(2*a);
        
        System.out.println("x1 =  " + x1);
        System.out.println("x2 =  " + x2);
        
    }
}
