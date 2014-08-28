import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {
	/**
	 * @param args
	 * @throws IOException 
	 * @throws NumberFormatException 
	 */
	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(in.readLine());
		int end_t[] = new int[n];
		int ans = 0;
		for(int i=0; i<n; i++)
		{
			int mmax = 0;
			String s[] = in.readLine().split(" ");
			int cur_t = Integer.parseInt(s[0]);
			int m = Integer.parseInt(s[1]);
			for(int j=0; j<m; j++)
			{
				int pre = Integer.parseInt(s[j+2]);
				mmax = Math.max(end_t[pre-1], mmax);
			}
			end_t[i] = cur_t+mmax;
			ans = Math.max(ans, end_t[i]);
			
		}
		System.out.println(ans);
	}
}

