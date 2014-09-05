import java.util.Arrays;
import java.util.Scanner;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int max = 35000;
		int a[] = new int[3001];
		boolean mark[] = new boolean[max];
		Arrays.fill(mark, true);
		int ans = 0;
		for(int i=2; i<max&&ans<=3000; i++)
		{
			if(mark[i])
			{
				a[ans++] = i;
			for(int j=i+1,p=0; j<max; j++)
			{
				if(mark[j])
				{
					p++;
					if(p==i)
					{
						mark[j] = false;
						p = 0;
					}
				}
			}
			}
			
		}
		Scanner in = new Scanner(System.in);
		while(in.hasNext())
		{
			int n = in.nextInt();
			if(n==0)
				break;
			System.out.println(a[n-1]);
		}
	}

}

