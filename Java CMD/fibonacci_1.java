import java.util.*;
class fibonacci_1
{
	public static void main(String A[])
	{
		int n;
		Scanner S= new Scanner(System.in);
		System.out.print("Enter the number: ");
		n=S.nextInt();
		fibo(n);
	}
	static void fibo(int n)
	{
		int i=2, sum=0, temp=1,total;
		System.out.print(sum+"\t"+temp);
		while(i!=n)
		{
			total=sum+temp;
			System.out.print("\t"+total);
			sum=temp;
			temp=total;
			++i;
		}
	}
}