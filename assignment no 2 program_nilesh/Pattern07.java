class Pattern07
{
	
public static void main(String args[])
{ 
	for(int i=1;i<=5;i++)
	{ 
		for(int j=4;j>=i;j--)
		{
			
			System.out.print(" ");
			
		}
		  for(int j=1;j<=i;j++)
		 {
				
			System.out.print("*");
		 }
		       for(int j=2;j<=i;j++)
		    {if(i!=1){
			
			  System.out.print("*");
		    }
			}
		System.out.println(" ");
	continue;
	}
	
	
	for(int a=1;a<=5;a++)
	{
		for(int b=2;b<=a;b++)
		if(a!=1){
			
			{
			System.out.print(" ");
		    }
		}
		for(int b=5;b>=a;b--)
		{
			
			System.out.print("*");
		}
		for(int b=4;b>=a;b--)
		{
				
			System.out.print("*");
			
		}
		System.out.println(" ");
	
	}
	
	
	
	
}
}

	
	

	