import java.util.Scanner;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = new int[10001];
		int cnt = 1;
		a[0] = 0;
		for(int i=1; cnt<10000; i++)
			for(int j=1; j<=i; j++)
			{
				a[cnt] = a[cnt-1]+i;
				cnt++;
				if(cnt>=10000)
					break;
			}
		Scanner in = new Scanner(System.in);
		while(in.hasNext())
		{
			int n = in.nextInt();
			if(n==0)
				break;
			System.out.println(n+" "+a[n]);
		}
	}

}

