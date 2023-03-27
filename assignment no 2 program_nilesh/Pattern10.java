import java.util.Scanner;
class Pattern10{
	public static void main(String args[]){
		
Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of rows to print the pattern ");
               
    int a = scanner.nextInt(); 
        for (int i = 5; i >= 1; i--)
        {
            for (int j = 1; j < i; j++)
            {
                System.out.print(" ");
            }

            for (int k = i; k<=5 ; k++)
            {
                System.out.print((char)(a) + " ");
				a++;
            }
			
            System.out.println();
			
        }
		a--;
	}
}
	