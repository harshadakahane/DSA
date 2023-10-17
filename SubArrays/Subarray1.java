class subarray
{
	public static void main(String[] args)
	{
		int count =0;
		int[] arr = new int[]{4,2,10,3,12,-2,15};
		for(int i=0; i<arr.length; i++)
		{
			for(int j=0; j<arr.length; j++)
			{
				if(i<=j)
				{
					count++;
				}
			}
		}
		System.out.println(count);
	}
}

