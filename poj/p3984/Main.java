import java.util.LinkedList;
import java.util.Scanner;

public class Main {
	public static int arr[][] = new int[5][5];
	public static int x1[] = {0,-1,1,0};
	public static int y1[] = {1,0,0,-1};
	public static node nd[] = new node[500],aa[] = new node[500];
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
			for(int i=0; i<5; i++)
				for(int j=0; j<5; j++)
				{
					arr[i][j] = in.nextInt();
				}
			bfs(4,4);
			
	}
	
	public static void bfs(int a,int b)
	{
		int count = 0;
		LinkedList<node> q = new LinkedList<node>();
		int num = 0;
		arr[a][b] = 1;
		node now = new node();
		node next = null;
		now.x = a;
		now.y = b;
		now.front = 0;
		now.step = 1;
		q.offer(now);
		boolean flag = true;
		while((now = q.poll())!=null)
		{	
			nd[num++] = now;
			for(int i=0; i<=3&&flag; i++)
			{
				a = now.x+x1[i];
				b = now.y+y1[i];
				
				if(a>=0&&b>=0&&a<5&&b<5&&arr[a][b]==0)
				{
					next = new node();
					arr[a][b] = 1;
					next.x = a;
					next.y = b;
					next.front = count;
					next.step = now.step+1;
					//System.out.println(next.x+","+next.y);
					q.offer(next);
					if(a==0&&b==0)
					{
						flag = false;
						break;
					}
				}
				
				
			}
			count++;
		}
		num--;
		int num1=0;
		aa[num1++] = nd[num];
		while(num!=0)
		{
			num = nd[num].front;
			aa[num1++] = nd[num];
		}
		for(int l=0; l<num1; l++)
			System.out.println("("+aa[l].x+", "+aa[l].y+")");
	}
}

class node{
	int x,y,front,step;
	public node(){
	}
	public node(int x, int y) {
		this.x = x;
		this.y = y;
	}
}

