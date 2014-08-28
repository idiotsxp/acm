import java.math.BigInteger;
import java.util.Scanner;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		BigInteger aa[] = new BigInteger[128];
		aa[0] = BigInteger.ONE;
		for(int i=1; i<128; i++)
			aa[i] = aa[i-1].multiply(BigInteger.valueOf(2));
		int n = in.nextInt();
		while(n-->0)
		{
			int m = in.nextInt();
			short a[] = new short[m];
			short b[] = new short[m];
			for(int i=0; i<m; i++)
			{
				a[i] = in.nextShort();
				if(i!=0)
					a[i] = (short) (a[i]^a[i-1]);
			}
			for(int i=0; i<m; i++)
			{
				b[i] = in.nextShort();
				if(i!=0)
					b[i] = (short) (b[i]^b[i-1]);
			}
			BigInteger start = BigInteger.ZERO;
			BigInteger end = BigInteger.ZERO;
			for(int i=m-1; i>=0; i--)
			{
				if(a[i]==1)
					start = start.add(aa[m-1-i]);
				if(b[i]==1)
					end = end.add(aa[m-1-i]);
			}
			System.out.println(end.max(start).subtract(end.min(start)));
		}
	}

}

