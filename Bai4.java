import java.util.Scanner;
 
public class Bai4 {
 
    public static void main(String[] args) {
         
        Scanner scanner = new Scanner(System.in);
         
        System.out.println("Nhap vao 1 so tu 1-12: ");
       int n = scanner.nextInt();
    
        if (n==1) {
        	System.out.println("Thang 1 ");
        } else if (n==2) {
        	System.out.println("Thang 2");
        } else if (n ==3){
        	System.out.println("Thang 3");
    	} else if (n == 4){
    		System.out.println("Thang 4");
    	} else if (n ==5 ) {
    		System.out.println("Thang 5");  		
    	} else if (n ==6 ) {
    		System.out.println("Thang 6");  		
    	} else if (n == 7) {
    		System.out.println("Thang 7");
    	} else if (n == 8) {
    		System.out.println("Thang 8");
    	} else if (n == 9) {
    		System.out.println("Thang 9");
    		
    	} else if (n == 10) {
    		System.out.println("Thang 10");
    		
    	}else if (n == 11) {
    		System.out.println("Thang 11");
    		
    	} else if (n == 12 ) {
    		System.out.println("Thang 12");
    		
    	} else {
    		System.out.println("Khong co thang "+ n);
       
    	}
    }
}