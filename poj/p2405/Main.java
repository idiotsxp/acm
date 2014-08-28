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
			double D = in.nextDouble();
			double V = in.nextDouble();
			if((int)D==0&&(int)V==0)
				break;
			double PI = Math.PI;
			System.out.printf("%.3f\n",Math.pow(Math.pow(D, 3)-6*V/PI, 1.0/3.0));
		}
	}

}

