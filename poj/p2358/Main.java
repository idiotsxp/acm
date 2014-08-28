import java.util.Scanner;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int m = in.nextInt();
		int dp[][] = new int[n+1][m+2];
		int arr[] = new int[n+1];
		int ans = 0;
		int temp = 0;
		for(int i=1; i<n+1; i++)
		{
			arr[i] = in.nextInt();
			for(int j=1; j<=m+1; j++)
			{
				temp = Math.max(dp[i-1][j-1], dp[i-1][j]);
				if((j&1)!=0)
				{
					dp[i][j] = temp+(arr[i]&1);
				}
				else dp[i][j] = temp+((arr[i]&1)^1);
				ans = Math.max(ans, dp[i][j]);
			}
				
		}
		System.out.println(ans);
		
	}

}

