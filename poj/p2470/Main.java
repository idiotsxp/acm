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
			if(n==0)
				break;
			int a[] = new int[n];
			for(int i=0;i<n;i++)
			{
				a[i] = in.nextInt();
			}
			boolean flag = true;
			for(int i=0; i<n; i++)
			{
				if(a[a[i]-1]!=i+1)
					flag = false;
			}
			if(!flag)
				System.out.println("not ambiguous");
			else System.out.println("ambiguous");
		}
	}

}

