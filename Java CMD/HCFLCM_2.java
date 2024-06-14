import java.util.*;
class HCFLCM_2 
{
	public static void main(String arg[])
	{
		int a,b;
		Scanner S=new Scanner(System.in);
		System.out.print("Enter the values: ");
		a=S.nextInt();
		b=S.nextInt();
		System.out.println("HCF: "+HCF(a,b));
		System.out.println("LCM: "+LCM(a,b));
	}
	static int HCF(int a,int b)
	{
		int i,hcf=0;
		for(i=1;i<=a||i<=b;i++)
		{
			if((a%i==0 && b%i==0))
			hcf=i;
		}
			return (hcf);
	}
	static int LCM(int a,int b)
	{
		int max,lcm=0;
		max=(a>b) ? a:b;
		while(true)
		{
			if((max%a==0) && (max%b==0))
			{
				lcm=max;
				break;
			}
			++max;
		}
		return (lcm);
	}
}