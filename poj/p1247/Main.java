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
			for(int i=0; i<n; i++)
				a[i] = in.nextInt();
			int s=0,e=0;
			boolean flag = true;
			for(int i=0,j; i<n&&flag; i++)
			{
				s +=a [i];
				e = 0;
				for(j=n-1; j>i; j--)
				{
					e += a[j];
				}
				if(s==e)
				{
					System.out.printf("Sam stops at position %d and Ella stops at position %d.\n",i+1,j+2);
					flag = false;
				}
			}
			if(flag)
				System.out.println("No equal partitioning.");
		}
	}

}

