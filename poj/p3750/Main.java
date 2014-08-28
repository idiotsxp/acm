import java.util.Scanner;
import java.util.Vector;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		Vector<boy> list = new Vector<boy>();
		for(int i=0; i<n; i++)
		{
			list.add(new boy(in.next()));
		}
		String str[] = in.next().split(",");
		int m = Integer.parseInt(str[0]);
		int k = Integer.parseInt(str[1]);
		for(int i=0; i<m-1; i++)
		{
			boy b = list.remove(0);
			list.add(b);
		}
		while(list.size()!=0)
		{
			for(int i=1; i<k;i++)
			{
				boy b = list.remove(0);
				list.add(b);
			}
			list.remove(0).print();
		}
	}

}

class boy
{
	String name;
	public boy(String name)
	{
		this.name = name;
	}
	public void print()
	{
		System.out.println(this.name);
	}
}

