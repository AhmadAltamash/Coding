import java.util.Scanner;
class arith
{
	public static void main(String A[])
	{
		int a,b,ch;
		Scanner s=new Scanner(System.in);
		do
		{	
			System.out.println("Enter the value: ");
			a=s.nextInt();
			b=s.nextInt();
			System.out.println("Choose your option:");
            System.out.println("1. Sum");
            System.out.println("2. Difference");
            System.out.println("3. Product");
            System.out.println("4. Quotient");
            System.out.println("5. Exit");
			ch=s.nextInt();
			switch(ch)
			{
				case 1:
				System.out.println("Sum:- "+(a+b));
				break;
				case 2:
				System.out.println("Difference:- "+(a-b));
				break;
				case 3:
				System.out.println("Product:- "+(a*b));
				break;
				case 4:
				System.out.println("Quotient:- "+((double)a/b));
				break;
				case 5:
                System.out.println("Exiting the program. Goodbye!");
                break;
				default:
				System.out.println("Invalid Choice");
			}
		}while(ch!=5);
	}
}