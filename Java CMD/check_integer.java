import java.util.*;
class check_integer
{	
	static boolean chkprime(int n)
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
	static boolean chkpalindrome(int n)
	{
		int i,sum=0,temp,rem;
		boolean p=true;
		temp=n;
		while(n>0)
		{
			rem=n%10;
			sum=(sum*10)+rem;
			n=n/10;
		}
		if(temp!=sum)
		{
			p=false;
		}
		return p;
	}
	static boolean chkarmstrong(int n)
	{
		int i,sum=0,temp,rem;
		boolean p=true;
		temp=n;
		while(n>0)
		{
			rem=n%10;
			sum=sum+(rem*rem*rem);
			n=n/10;
		}
		if(temp!=sum)
		{
			p=false;
		}
		return p;
	}
	static boolean chkwell(int n)
	{
		int ld=n%10,sld;
		boolean p=true;
		while(n>0)
		{
			n=n/10;
			sld=n%10;
			if(ld<sld)
			{
				p=false;
				break;
			}
			ld=sld;
		}
		return p;
	}
	public static void main(String arg[])
	{
		int n,ch;
		Scanner s=new Scanner(System.in);
		System.out.print("Enter the value: ");
		n=s.nextInt();
		do
		{
			System.out.print("Enter your choice: \n1:Prime Number\n2:Palindrom\n3:Armstrong\n4:Well Ordered\n5:Exit\n");
			ch=s.nextInt();
			switch(ch)
			{
				case 1:
				if(chkprime(n))
				{
					System.out.print("The number "+n+" is Prime Number\n");
				}
				else
				{
					System.out.print("The number "+n+" is not Prime Number\n");
				}
				break;
				case 2:
				if(chkpalindrome(n))
				{
					System.out.print("The number "+n+" is Palindrom Number\n");
				}
				else
				{
					System.out.print("The number "+n+" is not Palindrom Number\n");
				}
				break;
				case 3:
				if(chkarmstrong(n))
				{
					System.out.print("The number "+n+" is Armstrong Number\n");
				}
				else
				{
					System.out.print("The number "+n+" is not Armstrong Number\n");
				}
				break;
				case 4:
				if(chkwell(n))
				{
					System.out.print("The number "+n+" is Well Ordered Number\n");
				}
				else
				{
					System.out.print("The number "+n+" is not Well Ordered Number\n");
				}
				break;
				case 5:
					System.out.print("Exiting...");
					break;
				default:
					System.out.println("INVALID CHOICE...!!! ");
					break;
			}
		}while(ch!=5);
	}
}