import java.util.*;
class auto
{
	static boolean morphic(int n) 
	{
        int sq=n*n,ld, sqld;
        boolean p = true;
        while (n > 0) 
		{
            ld = n % 10;
            sqld = sq%10;
            if (ld != sqld)
			{
                p = false;
                break;
            }
			n=n/10;
			sq=sq/10;
        }
        return p;
    }
}
class automorphic
{
	public static void main(String a[])
	{
        int n;
        Scanner S = new Scanner(System.in);
		auto obj=new auto();
        System.out.print("Enter the value: ");
        n = S.nextInt();
        if (obj.morphic(n))
		{
            System.out.print("The number " + n + " is automorphic");
        }
		else
		{
            System.out.print("The number " + n + " is not automorphic");
        }
    }
}
