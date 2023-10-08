import java.util.Scanner;
class Reverse
{
	public static void main(String[] args)
	{
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the number to be reverse:");
	int n = sc.nextInt();
	

	System.out.println(reverse(n));

	}
	static int reverse(int n)
	{
		int rev =0;
		while(n!=0)
		{
			int digit=n%10;
			if(rev>Integer.MAX_VALUE/10 || rev<Integer.MIN_VALUE/10)
			{
			return 0;
			}

			rev = (rev * 10) +digit;
			n=n/10;
		}
                System.out.println("Reverse number is:");
		return rev;

	}
}

