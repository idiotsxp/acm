import java.util.Scanner;

public class Main {
	public static int frame[][] = new int[9][9];
	public static int count;
	public static boolean flag;
	public static point p[] = new point[81];
	public static boolean check(int x,int y,int z)
	{
		for(int i=0; i<9; i++)
		{
			if(frame[x][i]==z||frame[i][y]==z)
				return false;
		}
		int xx = x/3;
		int yy = y/3;
		for(int i=3*xx; i<3+3*xx; i++)
			for(int j=3*yy; j<3+3*yy; j++)
			{
				if(frame[i][j]==z)
					return false;
			}
		return true;
	}
	public static void dfs(int num)
	{
		if(flag)
		{
			return;
		}
		else if(num<0)
		{
			for(int i=0; i<9; i++)
			{
				for(int j=0; j<9; j++)
					System.out.print(frame[i][j]);
				System.out.println();
			}
			flag = true;
		}
		else
		{
			for(int i=1; i<=9; i++)
			{
				if(check(p[num].x,p[num].y,i))
				{
					frame[p[num].x][p[num].y] = i;
					dfs(num-1);
					frame[p[num].x][p[num].y] = 0;
				}
			}	
		}
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		while(n-- > 0)
		{
			flag = false;
			count = 0;
			for(int i=0; i<9; i++)
			{
				String s = in.next();
				for(int j=0; j<9; j++)
				{
					frame[i][j] = s.charAt(j)-'0';
					if(frame[i][j]==0)
					{
						p[count] = new point(i,j);
						count++;
					}
				}
			}
			dfs(count-1);
		}
	}

}
class point
{
	int x,y;

	public point(int x, int y) {
		this.x = x;
		this.y = y;
	}
}

