import java.util.*;
class ternary1{
public static void main (String args[])
{
Scanner sc = new Scanner(System.in);
System.out.println("enter the number");
int x= sc.nextInt();
int y= sc.nextInt();

int no= x>y? x+y:x-y;

System.out.println(no);
}
}
