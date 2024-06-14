import java.util.*;
class chkprime
{
	static boolean check(int n)
	{
		int i;
		boolean p=true;
		for(i=2;i<n;i++)
		{
			if(n%i==0)
			{
				p=false;
			}
		}
		return p;
	}
	public static void main(String arg[])
	{
		int n;
		Scanner S=new Scanner(System.in);
		System.out.print("Enter the value: ");
		n=S.nextInt();
		if(check(n))
		{
			System.out.print("The number "+n+" is prime Number");
		}
		else
		{
			System.out.print("The number "+n+" is not prime Number");
		}
	}
}