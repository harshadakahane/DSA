class subarray
{
	public static void main(String[] args)
	{
		int[] arr = new int[]{-1,2,-3,4,-1,2,1,-5,4};
		for(int i=0; i<arr.length; i++)
		{
			for(int j=i; j<arr.length; j++)
			{
				for(int k=i; k<=j; k++)
				{
					System.out.println(arr[k] +"");
				}
			}
		}
		System.out.println();
	}
}
