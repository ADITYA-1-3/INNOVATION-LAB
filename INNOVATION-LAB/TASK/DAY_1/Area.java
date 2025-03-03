import java.util.Scanner;
class Area {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("ENTER BASE OF RECTANGLE:");
		int base = input.nextInt();
		System.out.println("ENTER HEIGHT OF RECTANGLE:");
		int height = input.nextInt();
		int area = base * height;
		System.out.println("AREA OF RECTANGLE:"+area);
		input.close();
	}

}
