import java.util.Scanner;

public class Main {
	public static int a[][] = {
		{6,2,4,8},
		{1,3,9,7},
		{1,7,9,3},
		{1,9,1,9}
		};
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		while(in.hasNext())
		{
			int n = in.nextInt();
			int m = n-in.nextInt();
			int two = 0;
			int five = 0;
			int e=n;while(e/2!=0) {two += e/2;e/=2;}
			e=m;while(e/2!=0) {two -= e/2;e/=2;}
			e=m;while(e/5!=0) {five -= e/5;e/=5;}
			e=n;while(e/5!=0) {five += e/5;e/=5;}
			int three = f(n,3)-f(m,3);
			int seven = f(n,7)-f(m,7);
			int nine = f(n,9)-f(m,9);
			int ans = 1;
			if(two<five)
				System.out.println(5);
			else
			{
				if((two-five)!=0)
				ans *= a[0][(two-five)%4];
				ans %= 10;
				ans *= a[1][three%4];
				ans %= 10;
				ans *= a[2][seven%4];
				ans %= 10;
				ans *= a[3][nine%4];
				ans %= 10;
				System.out.println(ans);
			}
		}
	}
	/*public static int get2(int n)
	{
		if(n==0)
			return 0;
		else return n/2+get2(n/2);
	}
	public static int get5(int n)
	{
		if(n==0)
			return 0;
		else return n/5+get5(n/5);
	}*/
	public static int f(int n,int a)
	{
		if(n==0) return 0;
		else return f(n/2,a)+g(n,a);
	}
	public static int g(int n,int a)
	{
		if(n==0) return 0;
		else if(n%10<a) return n/10+g(n/5,a);
		else return n/10+g(n/5,a)+1;
	}
}

