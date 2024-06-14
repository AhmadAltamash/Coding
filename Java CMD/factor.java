import java.util.*;
class factor
{
	public static void main(String arg[])
	{
		int n,i;
		Scanner S=new Scanner(System.in);
		do
		{
			System.out.print("Enter the value: ");
			n=S.nextInt();
			fact(n);
			/*for(i=1;i<=n;i++)
			{
				if(n%i==0)
				{
					System.out.print(i+"\t\n");
					// System.out.print("\n");
				}
			}*/
		}while(n!=0);
		System.out.print("Exitting-->");
	}
	static void fact(int n)
	{
		for(int i=1;i<=n;i++)
			{
				if(n%i==0)
				{
					System.out.print("\t\n"+i);
					// System.out.print("\n");
				}
			}
	}
}