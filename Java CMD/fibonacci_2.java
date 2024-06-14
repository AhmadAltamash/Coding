import java.util.*;
class fib
{
	static int fibo(int n)
	{
		int t1=0,t2=1,sum=0,i,ser=0,f=0;
		for(i=1;i<=n;++i)
		{
			sum=sum+t2;
			f=t1+t2;
			t1=t2;
			t2=f;
		}
		return sum;
	}
}
class Fibonacci
{
	public static void main(String a[])
	{
		int n; 
		Scanner S=new Scanner(System.in);
		fib obj=new fib();
		System.out.print("Enter the value: ");
		n=S.nextInt();
		System.out.print("Sum of series: "+obj.fibo(n));
	}
}