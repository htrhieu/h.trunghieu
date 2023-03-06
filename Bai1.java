
 
import java.text.DecimalFormat;
import java.util.Scanner;
 
public class Bai1 {
 
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        DecimalFormat decimalFormat = new DecimalFormat("#.##");
         
        System.out.println("Nhap vao so thu 1: ");
        int firstNumber = scanner.nextInt();
        System.out.println("Nhap vao so thu 2: ");
        int secondNumber = scanner.nextInt();
         
        // 1. Tính tổng, hiệu, tích, thương, phép chia lấy dư
        int tong = firstNumber + secondNumber;
        System.out.println(firstNumber + " + " + secondNumber + " = " + tong);
         
        int hieu = firstNumber - secondNumber;
        System.out.println(firstNumber + " - " + secondNumber + " = " + hieu);
         
        int tich = firstNumber * secondNumber;
        System.out.println(firstNumber + " * " + secondNumber + " = " + tich);
         
        float thuong = (float) firstNumber / secondNumber;
        System.out.println(firstNumber + " / " + secondNumber + " = " + 
                decimalFormat.format(thuong));  
         
        int phanDu = firstNumber % secondNumber;
        System.out.println(firstNumber + " % " + secondNumber + " = " + phanDu);
         
        // 2. so sánh 2 số .
        System.out.println("KQ so sanh bang" + firstNumber + " va " + 
                secondNumber + " la " + (firstNumber == secondNumber));
        System.out.println("KQ so sanh khong bang " + firstNumber + " va " + 
                secondNumber + " la " + (firstNumber != secondNumber));
        System.out.println("KQ so sanh lon hon " + firstNumber + " va " + 
                secondNumber + " la " + (firstNumber > secondNumber));
        System.out.println("KQ so sanh lon hon hoac bang " + firstNumber + " va " + 
                secondNumber + " la " + (firstNumber >= secondNumber));
        System.out.println("KQ so sanh nho hon " + firstNumber + " va " + 
                secondNumber + " la " + (firstNumber < secondNumber));
        System.out.println("KQ so sanh nho hon hoac bang" + firstNumber + " va " + 
                secondNumber + " la " + (firstNumber <= secondNumber));
    }
 
}