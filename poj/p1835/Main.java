import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {
	public static int x,y,z,h,p;
	public static void right()
	{
		if(h==2)
		{
			if(p==0)
				p = 1;
			else if(p==1)
				p = 3;
			else if(p==3)
				p = 4;
			else p = 0;
		}
		else if(h==5)
		{
			if(p==0)
				p = 4;
			else if(p==4)
				p = 3;
			else if(p==3)
				p = 1;
			else p = 0;
		}
		else if(h==0)
		{
			if(p==5)
				p = 1;
			else if(p==1)
				p = 2;
			else if(p==2)
				p = 4;
			else p = 5;
		}
		else if(h==1)
		{
			if(p==0)
				p = 5;
			else if(p==5)
				p = 3;
			else if(p==3)
				p = 2;
			else p = 0;
		}
		else if(h==3)
		{
			if(p==2)
				p = 1;
			else if(p==1)
				p = 5;
			else if(p==5)
				p = 4;
			else p = 2;
		}
		else if(h==4)
		{
			if(p==2)
				p = 3;
			else if(p==3)
				p = 5;
			else if(p==5)
				p = 0;
			else p = 2;
		}
	}
	public static void forward(int num)
	{
		if(p==0)
			x += num;
		else if(p==1)
			y += num;
		else if(p==2)
			z += num;
		else if(p==3)
			x -= num;
		else if(p==4)
			y -= num;
		else  z -= num;
	}
	public static void up()
	{
		int t = h;
		right();
		right();
		h = p;
		p = t;
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
		int n = in.nextInt();
		while(n-->0)
		{
			x=0;y=0;z=0;h=2;p=0;
			int m = in.nextInt();
			for(int i=0; i<m; i++)
			{
				String st = in.next();
				int num = in.nextInt();
				if(st.equals("forward"))
					forward(num);
				else if(st.equals("back"))
				{
					right();
					right();
					forward(num);
				}
				else if(st.equals("up"))
				{
					up();
					forward(num);
				}
				else if(st.equals("right"))
				{
					right();
					forward(num);
				}
				else if(st.equals("down"))
				{
					up();
					up();
					up();
					forward(num);
				}
				else
				{
					right();
					right();
					right();
					forward(num);
				}
				//System.out.println(x+" "+y+" "+z+" "+p+" "+h);
			}
			System.out.println(x+" "+y+" "+z+" "+p);
		}
	}

}

