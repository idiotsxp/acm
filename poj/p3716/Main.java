import java.util.Scanner;

public class Main{
    public static void main(String []args)
	{
		Scanner in = new Scanner(System.in);
		int l = in.nextInt();
		while(l-->0)
		{
   			double m = in.nextDouble();
   			double n = in.nextDouble();
   			System.out.printf("%.3f\n",(m+n+10)/7.0);
		}
	}
}

