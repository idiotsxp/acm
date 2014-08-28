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
			if(a<168)
				System.out.println("CRASH "+a);
			else if(b<168)
				System.out.println("CRASH "+b);
			else if(c<168)
				System.out.println("CRASH "+c);
			else System.out.println("NO CRASH");
		}
	}

}

