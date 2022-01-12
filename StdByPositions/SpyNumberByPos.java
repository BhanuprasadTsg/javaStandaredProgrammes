class SpyNumberByPos 
{
	public static void main(String[] args) 
	{
		int pos = 1;

		int num = 1 ;

		int count = 0 ;

		while (count != pos)
		{
             int temp = num ;

			 int sum = 0 ;

		     int prod = 1 ;


			 while (temp > 0 )
			 {
                   sum += temp%10 ;

				   prod *= temp%10;

				   temp /= 10 ;
                      
			 }

			 if (sum == prod)
			 {
				 count++;
			 }
			 
			 num++;
		}

		System.out.println("The spy number at "+pos+" position is "+ (num-1));
	}
}
