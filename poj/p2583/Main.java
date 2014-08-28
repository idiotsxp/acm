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
			int a = in.nextInt();
			int b = in.nextInt();
			int c = in.nextInt();
			System.out.printf("%d %d %d\n",3*c-3*b+a,6*c-8*b+3*a,10*c-15*b+6*a);
		}
	}

}

