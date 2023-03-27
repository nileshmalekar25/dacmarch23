import java.util.*;
class lcm{	
public static void main(String args[]){
Scanner nil= new Scanner(System.in);
	System.out.println("enter the first num : ");
	int x= nil.nextInt();
	System.out.println("enter the second num : ");
	int y= nil.nextInt();
	System.out.println("enter the third num : ");
	int z= nil.nextInt();
	int a= (x>y)?x:y;
	int b=(a>z)?a:z;
	int c= x*y*z;
	for(int i=b;i<c;i=i+b)
	{
		if(i%x==0 && i%y==0 && i%z==0)
		{
	
	System.out.println("lcm : "+ i);
	break;
	
	}
	
	}
}
}
