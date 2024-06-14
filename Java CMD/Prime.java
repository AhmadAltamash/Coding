import java.util.*;
class Prime
{
	public static void main(String []arg)
	{
		int n,i,r,sum=0;
		Scanner obj= new Scanner(System.in);
		System.out.println("Enter the number: ");
		n=obj.nextInt();
		for(i=1;i<n;i++)
		{
			r=n%i;
			if(r==0)
			{
				sum = sum + i;
			}
		}
		if(sum == 1) 
		{
			System.out.println("The " + n + " is prime number");
		} 
		else 
		{
			System.out.println("The " + n + " is not prime number");
		}

	}
}