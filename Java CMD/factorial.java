class factorial
    {
        public static void main(String k[])
        {
            int i,n, facto=1;
            n=Integer.parseInt(k[0]);
            for(i=1;i<=n;i++)
            {
                facto = i*facto;
            }
	     System.out.println("Factorial:- "+facto);
        }
    }