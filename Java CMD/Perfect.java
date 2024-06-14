import java.util.Scanner;
class Perfect
{
	public static void main(String []arg)
	{
		int n,i,p,sum=0;
		Scanner obj= new Scanner(System.in);
		System.out.println("Enter the number: ");
		n=obj.nextInt();
		for(i=1;i<n;i++)
		{
			p=n%i;
			if(p==0)
			{
				sum = sum + i;
			}
		}
		if(sum == n) 
		{
			System.out.println("The " + n + " is perfect");
		} 
		else 
		{
			System.out.println("The " + n + " is not perfect");
		}

	}
}