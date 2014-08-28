import java.util.Scanner;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		while(in.hasNext())
		{
		int n = in.nextInt();
		int m = in.nextInt();
		char [][]ch = new char[n][m];
		int lay = Math.min(n, m)/2+Math.min(n, m)%2;
		char c = 'A';
		for(int i=0; i<lay; i++)
		{
			for(int j=i; j<m-i; j++)
			{
				ch[i][j] = c++;
				if(c>'Z')
					c = (char) (c-26);
			}
			for(int j=i+1; j<n-i; j++)
			{
				ch[j][m-i-1] = c++;
				if(c>'Z')
					c = (char) (c-26);
			}
			for(int j=m-i-2; j>=i&&ch[n-i-1][j]==0; j--)
			{
				ch[n-i-1][j] = c++;
				if(c>'Z')
					c = (char) (c-26);
			}
			for(int j=n-i-2; j>i&&ch[j][i]==0; j--)
			{
				ch[j][i] = c++;
				if(c>'Z')
					c = (char) (c-26);
			}
		}
		for(int i=0; i<n; i++)
		{
			for(int j=0; j<m; j++)
			{
				System.out.print("   "+ch[i][j]);
			}
			System.out.println();
		}
	}
	}
}

