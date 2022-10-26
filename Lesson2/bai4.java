import java.time.Duration;
import java.util.Scanner;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class bai4 {
	public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Nhap ngay, thang, nam sinh (Vi du:04/11/2016): ");
            String day1 = sc.nextLine();
            LocalDate s2 = LocalDate.now();
            LocalDate s1 = LocalDate.parse(day1,DateTimeFormatter.ofPattern("MM/dd/yyyy"));
            
            Duration duration = Duration.between(s1.atStartOfDay(), s2.atStartOfDay());
            System.out.print("Tuoi cua ban la: " + (int)(duration.toDays()/365.25));
        }
	}
}