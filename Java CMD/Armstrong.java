import java.util.Scanner;
class Armstrong
{
	public static void main(String []arg)
	{
		int n,temp,r,sum=0;
		Scanner obj= new Scanner(System.in);
		System.out.println("Enter the number: ");
		n=obj.nextInt();
		temp=n;
		while(n>0)
		{
			r=n%10;
			sum=sum+(r*r*r);
			n=n/10;
		}
		if(sum == temp) 
		{
			System.out.println("The " + temp + " is Armstrong number");
		} 
		else 
		{
			System.out.println("The " + temp + " is not Armstrong number");
		}

	}
}