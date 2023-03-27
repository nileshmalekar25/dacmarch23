import java.util.Scanner;
class conversion{
public static void main (String args[]){
	Scanner sc = new Scanner(System.in);
	System.out.println("temp in fahrenheit:");
	double a= sc.nextDouble();
	double c=(a-32)*5/9;
	System.out.println("the temp in celsius is:" + c);
	
	System.out.println("temp in celsius:");
	double b= sc.nextDouble();
	double f= (b*9/5)+32;
	System.out.println("the temp in fahrenheit is:" + f);

}
}