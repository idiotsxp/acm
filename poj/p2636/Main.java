import java.util.Scanner;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		for(int i=0; i<n; i++)
		{
			int m = in.nextInt();
			int sum = -m+1;
			for(int j=0; j<m; j++)
				sum+=in.nextInt();
			System.out.println(sum);
		}
	}

}

