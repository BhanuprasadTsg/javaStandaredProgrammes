class ArmstrongNumber 
{
	public static void main(String[] args) 
	{
		int num = 407 ;

		int original = num ;

		int sum = 0;

		int count=0;

		while (num>0)
		{
			count++;
			
			num /=10;
		}

		num = original ;

		while(num>0){
			
			int tempSum = 0 ;

			int tempCount = count ;
               
			   tempSum = num%10 ; 

			   int tempprod = 1;



			   while (count>0)
			   {
				   tempprod *= tempSum;
					   count--;
					   System.out.println("count "+count);
			   }

			   System.out.println("temp sum "+tempprod);

			   count = tempCount ;

			   sum = sum + tempprod ;

			   num /= 10 ;

		}

		if (original == sum )
		{ 
			System.out.println(original+" is a armstrong number ");
		}
		else
			System.out.println(original+ " is  not a armstrong number");
	}
}
