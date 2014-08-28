import java.util.Scanner;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		while(n-->0)
		{
			int a = in.nextInt();
			int b = in.nextInt();
			if(a==b)
				if(a%2==0)
					System.out.println(a+b);
				else System.out.println(a+b-1);
			else if(a-2==b)
				if(a%2==0)
					System.out.println(a+b);
				else System.out.println(a+b-1);
			else System.out.println("No Number");
		}
	}

}

