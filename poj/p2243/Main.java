import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;
public class Main {
	public static int x[] = {-1,1,-2,2,-1,1,-2,2};
	public static int y[] = {2,2,-1,-1,-2,-2,1,1};
	public static int x2,y2;
	public static boolean visited[][] = new boolean[8][8];
	public static Node a[] = new Node[1000];
	public static int Astar(Node node)
	{
		int front = 0,rear = 0;
		a[rear++] = node;
		while(front<rear)
		{
			Node t = a[front++];
			visited[t.x][t.y] = true;
			if(t.x==x2&&t.y==y2)
				return t.step;
			for(int i=0; i<8; i++)
			{
				Node s = new Node();
				s.x = t.x+x[i];
				s.y = t.y+y[i];
				if(s.x>=0&&s.x<8&&s.y>=0&&s.y<8)
					if(!visited[s.x][s.y])
				{
					s.g = t.g+23;
					s.h = gujia(s);
					s.f = s.g+s.h;
					s.step = t.step+1;
					a[rear++] = s;
								}
			}
		}
		return 0;
		
	}
	public static int gujia(Node node)
	{
		return (Math.abs(node.x-x2)+Math.abs(node.y-y2))*10;
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		while(in.hasNext())
		{
			Arrays.fill(a, new Node(0,0));
			char start[] = in.next().toCharArray();
			char end[] = in.next().toCharArray();
			int x1 = start[0]-'a',y1 = start[1]-'1';
			x2 = end[0]-'a';y2 = end[1]-'1';
			for(int i=0; i<8; i++)
				Arrays.fill(visited[i], false);
			Node n = new Node(x1,y1);
			n.step = 0;
			n.g = 0;
			n.h = gujia(n);
			n.f = n.g+n.h;
			System.out.println("To get from "+new String(start)+" to "+new String(end)+" takes "+Astar(n)+" knight moves.");
		}
	}

}
class Node
{
	int x,y,step;
	int g,h,f;
	Node(){};
	public Node(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
}
class compare implements Comparator
{

	@Override
	public int compare(Object o1, Object o2) {
		// TODO Auto-generated method stub
		Node n1 = (Node)o1;
		Node n2 = (Node)o2;
		if(n1.f>n2.f)
			return 1;
		else if(n1.f<n2.f)
			return -1;
		else
			return 0;
	}
	
}

