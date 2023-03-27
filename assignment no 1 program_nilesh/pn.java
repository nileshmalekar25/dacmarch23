import java.util.*;
class pn{
public static void main (String args[])
{
Scanner sc = new Scanner(System.in);
System.out.println("enter the  number : ");
int x= sc.nextInt();
String no= x>=0? "positive number": "negative number";
System.out.println(no);
}
}