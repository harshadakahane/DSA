class demo
{
	public static void main(String[] args)
	{
		int[] arr = new int[]{2,3,4,1};
		int prefixsum[] = new int[arr.length];
		int totalsum =0;
		for(int i=0; i<arr.length; i++)

		{
			int sum=0;
			for(int j=0; j<arr.length; j++)
			{
				sum = sum + arr[j];
				totalsum= totalsum+sum;
			}
		}
		System.out.println(totalsum);
	}
}


