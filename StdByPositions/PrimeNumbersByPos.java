class PrimeNumbersByPos 
{
	public static void main(String[] args) 
	{
	     int pos = 16 ;

		 int count = 0 ;

		 for (int i = 1; i<=i+1 ; i++ )
		 {
			 boolean isPrime = true ;

			 for ( int j = 2 ; j < i; j++)
			 {
				 if ( i%j == 0)
				 {
					 isPrime = false ;
				 }
				
			 }
			  if (isPrime == true)
				 {
				   System.out.println(i);
				
				  count++;
				 }


				 if (count == pos )
				 {
					System.out.println(pos+" number prime number is "+i);
					break;
				 }
		 }
	}
}
