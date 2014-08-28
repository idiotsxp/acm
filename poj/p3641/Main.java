import java.util.Scanner;

public class Main {
	public static int prim[] = { 2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 41,
        43, 47, 53, 59, 67, 71, 73, 79, 83, 89, 97};
	public static int length = prim.length;
	public static long montgomary(long n,long n2,long l)
	{
		long k = 1;
		n %= l;
		while(n2!=1)
		{
			if((n2&1)!=0)
				k = (k*n)%l;
			n = (n*n)%l;
			n2 >>= 1;
		}
		return (k*n)%l;
	}
	public static boolean RabbinMiller(long n)
	{
		if(n<2)
			return false;
		if(n==2)
			return true;
		if((n&1)==0)
			return false;
		for(int i=0; prim[i]*prim[i]<=n; i++)
		{
			if(n%prim[i]==0)
				return false;
		}
		int r=0,m=(int) (n-1);
		while(1!=(1&m))
		{
			m >>= 1;
			r++;
		}
		for(int i=0; i<8; i++)
		{
			int a = prim[(int) (Math.random()*length)];
			if(1!=montgomary(a,m,n))
			{
				int j=0;
				int e=1;
				for(;j<r;j++)
				{
					if(n-1==montgomary(a,m*e,n))
						break;
					e <<= 1;
				}
				if(j==r)
					return false;
			}
		}
		return true;
	}
	
	public static boolean isPrim(long n)
	{
		if(n==2)
			return true;
		 if((n&1)==0||n<=1)
			 return false;
		 int j=3;
		 while(j*j<n)
		 {
			 if(n%j==0)
				 return false;
			 j+=2;
		 }
		 return true;
		 
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		while(in.hasNext())
		{
			long a = in.nextLong();
			long b = in.nextLong();
			if(a==0&&b==0)
				break;
			if(isPrim(a))
				System.out.println("no");
			else if(b!=montgomary(b,a,a))
				System.out.println("no");
			else 
				System.out.println("yes");
		}
	}

}

