class Pyramid4

{
	
public static void main(String args[])
{ int a=1;
	for(int i=1;i<=9;i++)
	{ 
		for(int j=7;j>=i;j--)
		{
			
			
			System.out.print(" ");
			
		}
		for(int k=1;k<=i;k++)
		{
			
			
			System.out.print(k);
			
		}
		for(int l=2;l<=i;l++)
		{
			
			
			System.out.print(a);
			a--;
			
		}
		
			System.out.println("  ");
		a++;
	}
	
		
	}
	
}