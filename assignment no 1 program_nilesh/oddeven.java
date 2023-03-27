import java.util.*;
class oddeven{
public static void main (String args[])
{
Scanner sc = new Scanner(System.in);
System.out.println("enter the number : ");
int i= sc.nextInt();
String no = i%2==0?"even":"odd";

System.out.println(no);
}
}

