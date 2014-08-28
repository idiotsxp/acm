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
			String str[] = in.nextLine().split(",");
			long n = Integer.valueOf(str[0], 16);
			int x = Integer.parseInt(str[1]);
			int y = Integer.parseInt(str[2]);
			n = n&~(1<<x);
			n = n&~(1<<(y-2));
			n = n|(6<<(y-2));
			System.out.println(Integer.toHexString((int)n));
		}
	}

}

