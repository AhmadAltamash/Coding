import java.util.*;
class wellordered
{
	static boolean ordered(int n)
	{
		int ld=n%10,sld;
		boolean p=true;
		do
		{
			n=n/10;
			sld=n%10;
			if(ld<sld)
			{
				p=false;
				break;
			}
			ld=sld;
		}while(n!=0);
		return (p);
	}	
	public static void main(String a[])
	{
		int n;
		Scanner S=new Scanner(System.in);
		System.out.print("Enter the value: ");
		n=S.nextInt();
		if(ordered(n))
		{
			System.out.print("The number "+n+" is well ordered");
		}
		else
		{
			System.out.print("The number "+n+" is not well ordered");
		}
	}
}