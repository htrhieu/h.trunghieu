
import java.text.DecimalFormat;
import java.util.Scanner;
 
public class Bai8 {
 
    public static void main(String[] args) {
        int n, sum = 0, number;
        float TBC;
        Scanner scanner = new Scanner(System.in);
        DecimalFormat decimalFormat = new DecimalFormat("#.##");    
        System.out.println("Nhap vao day cac so nguyen : ");
        n = scanner.nextInt();
        for (int count = 1; count <=n; count++) {
            System.out.println("So thu " + count + ": ");
            number = scanner.nextInt();
            sum += number;
        }
         
        TBC = (float) sum / n;
        System.out.println("Trung binh cong day so  = " + decimalFormat.format(TBC));
    }
 
}