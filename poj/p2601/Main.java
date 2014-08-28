import java.util.Scanner;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		double a0 = in.nextDouble();
		double a_n1 = in.nextDouble();
		double c[] = new double[n];
		for(int i=0; i<n;i++)
			c[i] = in.nextDouble();
		double a1 = a_n1+n*a0;
		for(int i=0; i<n; i++)
			a1 -= 2*(n-i)*c[i];
		System.out.printf("%.2f",a1/(n+1));
	}

}

