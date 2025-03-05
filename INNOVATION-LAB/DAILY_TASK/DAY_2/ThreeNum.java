import java.util.Scanner;
class ThreeNum {
    public static void main(String[] args) {
        int a, b, c;
        Scanner input = new Scanner(System.in); 
        System.out.println("ENTER FIRST NUMBER :");
        a = input.nextInt();
        System.out.println("ENTER SECOND NUMBER :");
        b = input.nextInt();
        System.out.println("ENTER THIRD NUMBER :");
        c = input.nextInt();

        if (a>b && a>c) {
            System.out.println("LARGEST NUMBER IS : " + a);
        } else if (b>a && b>c) {
            System.out.println("LARGEST NUMBER IS : " + b);
        
        } else if (a==b && a==c) {
            System.out.println("ALL NUMBERS ARE EQUAL");
        } else if (a==b && a>c) {
            System.out.println("LARGEST NUMBER IS : " + a);
        } else if (a==c && a>b) {
            System.out.println("LARGEST NUMBER IS : " + a);
        } else if (b==c && b>a) {
            System.out.println("LARGEST NUMBER IS : " + b);
        }
         
        else {
            System.out.println("LARGEST NUMBER IS : " + c);
        }

        
        input.close(); 
    }
}