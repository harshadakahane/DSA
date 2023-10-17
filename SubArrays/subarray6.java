class demo
{
	public static void main(String[] args)
	{
		int[] arr = new int[]{2,4,1,3};
		int prefixsum[] = new int[arr.length];

		prefixsum[0]=arr[0];
		for(int i=1; i<arr.length; i++)
		{
			prefixsum[i] = prefixsum[i-i]+arr[i];
		}
		for(int i=0; i<arr.length; i++)
		{
			int sum=0;
			for(int j=i; j<arr.length; j++)
			{
				
				if(i==0)
				sum = prefixsum[j];
				else
					sum=prefixsum[j]-prefixsum[i-1];
			}
			System.out.println(sum);
		}
	}
}

