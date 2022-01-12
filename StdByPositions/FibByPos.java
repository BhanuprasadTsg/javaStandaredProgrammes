class FibByPos 
{
	public static void main(String[] args) 
	{
		int num = 5 ;

		int n1 = 0 ;

		int n2 = 1 ;

		int count = 2 ;

		//System.out.print(n1+","+n2+",");

		for ( int i = 0 ; i<i+1; i++ )
		{
			int n3 = n1 + n2 ;

		    count++;

			if (count==num)
			{
				System.out.println("The fibonacci series at pos "+num+" is "+ n3);
			}

			n1 = n2 ;

			n2 = n3 ;
		}
	}
}
