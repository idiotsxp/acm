import java.util.Arrays;
import java.util.Scanner;

public class Main {
public static int dis[][];
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		while(in.hasNext())
		{
			int n = in.nextInt();
			if(n==0)
				break;
			dis = new int[n+1][n+1];
			for(int i=1; i<n+1; i++)
				Arrays.fill(dis[i], 100000);
			for(int i=1; i<=n; i++)
			{
				int m = in.nextInt();
				for(int j=0; j<m; j++)
				{
					int num = in.nextInt();
					dis[i][num] = in.nextInt();
				}
			}
			for(int i=1; i<=n; i++)
				
				for(int j=1; j<=n; j++)
					if(j!=i)
					for(int k=1; k<=n; k++)
					{
						
						if(dis[j][k]>dis[j][i]+dis[i][k]&&k!=i&&k!=j)
							dis[j][k] = dis[j][i]+dis[i][k];
					}
			int min=100000,max,flag=0;
			for(int i=1; i<=n; i++)
			{
				max = 0;
				for(int j=1; j<=n; j++)
				{
					if(j!=i)
					max = (max>dis[i][j])?max:dis[i][j];
				}
				if(max<min)
				{
					flag = i;
					min = max;
				}
			}
			if(min==100000)
			{
				System.out.println("disjoint");
			}
			else System.out.println(flag+" "+min);
		}
			
			
	}

}

