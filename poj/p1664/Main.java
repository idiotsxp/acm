import java.util.Scanner;

public class Main {
	public static void dfs(int p,int w)
	{
		if(p==0)
			count++;
		else
			for(int i=w; i>0; i--)
			{
				if(p-i>=0)
					dfs(p-i,i);
				else continue;
			}
	}
	public static int count = 0;
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		while(n-->0)
		{
			count = 0;
			int p = in.nextInt();
			int w = in.nextInt();
				dfs(p,w);
			System.out.println(count);
			
		}
	}

}

