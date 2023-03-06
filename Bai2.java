
import java.util.Scanner;
 
public class Bai2 {
    public static void main(String[] args) {
        int n;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap vao n:");
        n = scanner.nextInt();
        if (n % 2 == 0) {
            System.out.println(n + " La so chan !");
        } else {
            System.out.println(n + " La so le !");
        }
    }
}