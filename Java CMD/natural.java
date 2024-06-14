import java.util.*;
class natural 
{
	static int sum(int n)
	{
		if(n!=0)
		{
			n=n+sum(n-1);
		}
		return n;
	}
	public static void main(String a[])
	{
		int n;
		Scanner S= new Scanner(System.in);
		System.out.print("Enter the value: ");
		n=S.nextInt();
		System.out.print("Sum of "+n+" Naturals numbers is "+sum(n));
	}
}
