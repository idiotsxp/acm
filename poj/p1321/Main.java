import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static int count,n;
	public static void dfs(char frame[][],int k,int x)
	{
		if(k<=0)
		{
			count++;
		}
		else
		{
			for(int i=x; i<n; i++)
				for(int j=0; j<n; j++)
				{	
					if(frame[i][j]=='#')
					{
						/*for(int a=0; a<n; a++)
							c[i][a] = '.';*/
						boolean flag[] = new boolean[n]; 
						Arrays.fill(flag, false);
						for(int a=0; a<n; a++)
						{
							if(frame[a][j]=='#')
							{
								flag[a] = true;
								frame[a][j] = '.';
							}
						}
						dfs(frame,k-1,i+1);
						for(int a=0; a<n; a++)
						{
							if(flag[a])
								frame[a][j]='#';
						}
						
					}
					else continue;
				}
		}
			
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		while(in.hasNext())
		{
			count = 0;
			n = in.nextInt();
			int k = in.nextInt();
			if(n==-1&&k==-1)
				break;
			char frame[][] = new char[n][n];
			for(int i=0; i<n; i++)
			{
				frame[i] = in.next().toCharArray();
			}
			dfs(frame,k,0);
			System.out.println(count);
			
		}
	}

}

