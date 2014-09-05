import java.util.Scanner;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in  = new Scanner(System.in);
		while(in.hasNext())
		{
			System.out.println(mod(in.nextInt(),in.nextInt()));
		}
	}
	public static int mod(int a, int b)
	{
		return a-a/b*b;
	}
}

