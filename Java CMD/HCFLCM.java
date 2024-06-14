import java.util.*;
class HCFLCM 
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
		while(a!=b)
		{
			if(a>b)
			a=a-b;
		else
			b=b-a;
		}
		return (a); 
	}
	static int LCM(int a,int b)
	{
		return ((a*b)/HCF(a,b));
	}
}