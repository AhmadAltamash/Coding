import java.util.*,;
class Area
{
	static int triangle(int b, int h)
	{
		int a= (b*h)/2;
		return a;
	}
	static double circle(double r)
	{	
		double a;
		a=r*r*3.14;
		return a;
	}
	static int rectangle(int l, int b)
	{
		int a=l*b;
		return a;
	}
	static double cylinder(double r, double h)
	{
		double a;
		a=3.14*r*r*h;
		return a;
	}
	public static void main(String arg[])
	{
		int ch,a,b;
		double r=0,h=0;
		Scanner S=new Scanner(System.in);
		
		do
		{
			System.out.print("Enter your choice: \n1:Triangle\n2:Rectangle\n3:Circle\n4:Cylinder\n5:Exit\n");
			ch=S.nextInt();
			if(ch==3)
			{
				System.out.println("Enter the value: ");
				r=S.nextDouble();
				System.out.println("Area of Circle:- "+circle(r));
			}
			else if(ch==4)
			{
				System.out.println("Enter the value: ");
				r=S.nextDouble();
				h=S.nextDouble();
				System.out.println("Area of Cylinder:- "+cylinder(r,h));
			}
			else if(ch==5)
			{
				System.out.print("Exit...!!!");
			}
			else
			{
				System.out.println("Enter the value: ");
				a=S.nextInt();
				b=S.nextInt();
				switch(ch)
				{
				case 1:
				System.out.println("Area of Triangle:- "+triangle(a,b));
				break;
				case 2:
				System.out.println("Area of Rectangle:- "+rectangle(a,b));
				break;
				case 3:
				System.out.println("Area of Circle:- "+circle(r));
				break;
				case 4:
				System.out.println("Area of Cylinder:- "+cylinder(r,h));
				break;
				case 5:
				System.out.print("Exit");
				break;
				}
			}
		}while(ch!=5);
	}
}