import java.util.*;
class variable{
public static void main (String args[])
{
Scanner sc = new Scanner(System.in);
System.out.println("enter three number: ");
System.out.println("enter first number: ");
int x= sc.nextInt();
System.out.println("enter second number: ");
int y= sc.nextInt();
System.out.println("enter third number: ");
int z= sc.nextInt();

int a=(x<y)?x:y;
int temp1 = (a<z)?a:z;
System.out.println("min number is = " + temp1);
int b=(x>y)?x:y;
int temp2 = (b>z)?b:z;
System.out.println("max number is = " + temp2);



}
}
