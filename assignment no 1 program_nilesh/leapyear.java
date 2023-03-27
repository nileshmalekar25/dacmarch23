import java.util.*;
class leapyear{
public static void main (String args[])
{
Scanner sc = new Scanner(System.in);
System.out.println("enter the  year : ");
int x= sc.nextInt();
String no= x%4==0? "this is leap year": "this is not leap year";
System.out.println(no);
}
}