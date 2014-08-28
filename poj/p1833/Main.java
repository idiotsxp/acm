import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
//import java.util.Scanner;

public class Main {

	public static boolean next_permutation(int ch[])
	{
		//int first = 0;
		int last = ch.length;
		/*if(first==last||first==last-1)
			return false;*/
		for(int i=last-1; i>=0; i--)
			for(int j=last-1; j>=i+1; j--)
			{
				if(ch[j]>ch[i])
				{
					int c = ch[i];
					ch[i] = ch[j];
					ch[j] = c;
					Arrays.sort(ch, i+1, last);
					return true;
				}
			}
		return false;
			
	}
	/**
	 * @param args
	 * @throws IOException 
	 * @throws NumberFormatException 
	 */
	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		InputStreamReader is = new InputStreamReader(System.in);
		BufferedReader in = new BufferedReader(is);
		int n = Integer.parseInt(in.readLine());
		while(n-->0)
		{
			String s[] = in.readLine().split(" ");
			int m = Integer.parseInt(s[0]);
			int a[] = new int[m];
			int next = Integer.parseInt(s[1]);
			s = in.readLine().split(" ");
			for(int i=0; i<m; i++)
			{
				a[i] = Integer.parseInt(s[i]);
			}
			boolean flag = true;
			for(int i=0; i<next; i++)
			{
				
					flag = next_permutation(a);
					if(!flag)
					{
						Arrays.sort(a);
					}
			}
			for(int i=0; i<m; i++)
				System.out.print(a[i]+((i==m-1)?"\n":" "));
		}
	}

}

