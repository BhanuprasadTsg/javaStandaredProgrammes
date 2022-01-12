class Strong 
{
	public static void main(String[] args) 
	{
		int num = 40585 ;

		int original = num ;

		int sum = 0;

		while (num>0)
		{
           int temp = num%10  ;

		   int tempSum = 1;

		   for ( int i = 1; i<=temp ;i++ )
		   {
                 tempSum = tempSum*i;
				 System.out.println("the tempsum is "+tempSum);
		   }
                 
					  sum = sum + tempSum ;
					  System.out.println("the sum is "+sum);

		   num /= 10 ;
		}

		if (original == sum)
		{
			System.out.println(original+" is a Strong number ");
		}
		else {
			System.out.println(original+" is not a Strong number");
		}
	}
}
