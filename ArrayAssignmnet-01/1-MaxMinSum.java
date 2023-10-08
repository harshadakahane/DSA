import java.util.*;
class MinMax
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size of an array:");
		int n = sc.nextInt();
		
                int sum =0;
		int[] arr = new int[n];
                System.out.println("Enter elements in an array:");
		for(int i=0; i<n; i++)
		{
			arr[i] =sc.nextInt();
		}
		 
		
	
		if(arr == null|| arr.length ==0)
		return;

		int minElem = Integer.MAX_VALUE;
		int maxElem = Integer.MIN_VALUE;
		for(int i=1; i<arr.length; i++)
		{
			if(arr[i]>maxElem)
			{
			maxElem = arr[i];
			}
			if(arr[i]<minElem)
			{
			minElem = arr[i];
			}
		}
		System.out.println("Maxmium element in an array is:" +maxElem);
		System.out.println("Minimum element in an array is:" +minElem);
		

		sum = maxElem + minElem;
		System.out.println("Sum of Maximum element and Minimum element in an array is= " +sum);
	}
}



