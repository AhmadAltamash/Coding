import java.util.*;
class Swap 
{
	static public void main(String arg[])
	{
		int a,b;
		Scanner S= new Scanner(System.in);
		System.out.println("Enter the value: ");
		a=S.nextInt();
		b=S.nextInt();
		System.out.println("Values before Swapping: "+a+" "+b);
		swap_ obj = new swap_();
		obj.swap(a,b);
	}
}
class swap_
{
	static void swap(int a, int b)
	{
		a=(a+b);
		b=(a-b);
		a=(a-b);
		System.out.println("Values after Swapping: "+a+" "+b);
	}
}