import java.util.*;
class Linearsearch
{
	
	public static void main(String[] args)
	
	{
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter size of an array:");

		int n = sc.nextInt();

		int[] arr = new int[n];

		System.out.println("Enter elements in an array:");

		for(int i=0; i<n; i++)

		{

			arr[i] =sc.nextInt();
		}
		System.out.println("Enter the value of B:");

		int B = sc.nextInt();
	
		int count =0;

		for(int i=0; i<arr.length; i++)
		{
			if(arr[i] == B)
			count++;
		}
		System.out.println("The number of occurence of B in an array is =" +count);
	}
}

