import java.util.Scanner;

public class Main {
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		while(n-->0)
		{
			int a = in.nextInt();
			int b = in.nextInt();
			int c = in.nextInt();
			if(b-c>a)
				System.out.println("advertise");
			else if(b-c==a)
				System.out.println("does not matter");
			else System.out.println("do not advertise");
		}
	}
}

