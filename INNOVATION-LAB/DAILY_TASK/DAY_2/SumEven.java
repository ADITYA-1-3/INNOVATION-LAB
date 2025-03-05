

import java.util.Scanner;
class SumEven
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the limit value : ");
		int n =input.nextInt();
		int esum = 0;
		for(int s=1;s<=n;s++)
		{
			if(s%2==0)
				esum +=   s;
 
		}
		System.out.println("Sum of Even Numbers :"+ esum);
	}
}