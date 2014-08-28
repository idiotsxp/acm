import java.math.BigInteger;
import java.util.Scanner;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int[] a = new int[n],b = new int[n];
		for(int i=0; i<n; i++)
			a[i] = in.nextInt();
		b[0] = a[n-1];
		for(int i=1; i<n; i++)
			b[i] = b[i-1]^a[n-1-i];
		BigInteger ans = BigInteger.ZERO;
		BigInteger two = new BigInteger("2");
		for(int i=0; i<n; i++)
		{
			ans = ans.multiply(two);
			if(b[i]==1)
				ans = ans.add(BigInteger.ONE);
		}
		System.out.println(ans);
	}

}

