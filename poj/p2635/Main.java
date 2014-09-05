import java.math.BigInteger;
import java.util.Scanner;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean b[] = new boolean[1000005];
		for(int i=1; i<1000001; i+=2)
			b[i] = true;
		for(int i=2; i<1000001; i+=2)
			b[i] = false;
		b[1] = false;
		b[2] = true;
		for(int i=3,j=2; i<=1000; i+=2)
		{
			if(b[i])
			while(j*i<1000001)
			{
				b[i*j] = false;
				j++;
			}
			j=2;
		}
		Scanner in = new Scanner(System.in);
		while(in.hasNext())
		{
			BigInteger l = in.nextBigInteger(),temp,ll;
			int m = in.nextInt(),j=1000010;
			BigInteger zero = BigInteger.ZERO; 
			if(l.compareTo(zero)==0&&m==0)
				break;

			for(int i=1; i<1000001; i++)
			{
				if(b[i])
				{
					temp = l.divide(BigInteger.valueOf(i));
					ll = temp.multiply(BigInteger.valueOf(i));
			
				if(l.compareTo(ll)==0)
				{
					j=i;
					break;
				}
				}
			}
			if(j<m)
				System.out.println("BAD "+j);
			else System.out.println("GOOD");
		}
	}

}

