import java.util.Scanner;

public class SwapNumbers {
    public static void main(String[] args) {
        int a, b;
        Scanner scanner = new Scanner(System.in); 

        System.out.println("ENTER THE FIRST NUMBER");
        a = scanner.nextInt(); 
        System.out.println("ENTER THE SECOND NUMBER");
        b = scanner.nextInt(); 

        System.out.println("BEFORE SWAPPING");
        System.out.println("A = " + a);
        System.out.println("B = " + b);
        
        a = a + b;
        b = a - b;
        a = a - b;

        System.out.println("AFTER SWAPPING");
        System.out.println("A = " + a);
        System.out.println("B = " + b);

        scanner.close(); 
    }
}
