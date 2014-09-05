import java.util.Scanner;

public class Main {
	static double a,b,c,d;
	static boolean flag;
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		a = in.nextDouble();
		b = in.nextDouble();
		c = in.nextDouble();
		d = in.nextDouble();
		flag = false;
		for(int i=0; i<4&&!flag; i++)
			for(int j=0; j<4&&!flag; j++)
				for(int k=0; k<4&&!flag; k++)
					for(int type=0; type<5&&!flag; type++)
					{
						if(cal(i,j,k,type))
							output(i,j,k,type);
							flag =false;
					}
	}
	public static String getOp(int op)
	{
		switch(op)
		{
		case 0:return "+";
		case 1:return "-";
		case 2:return "*";
		case 3:return "/";
		default:return "";
		}
	}
	
	
	public static double f(double a, double b, int op)
	{
		switch(op)
		{
		case 0:return a+b;
		case 1:return a-b;
		case 2:return a*b;
		case 3:return a/b;
		default:return 0;
		}
	}
	
	public static boolean cal(int p1, int p2, int p3, int type)
	{
		double ans = 0;
		if(0 == type)        
			ans= f(f(f(a,b,p1),c,p2),d,p3);     
		else if(1 == type)        
			ans= f(f(a,b,p1),f(c,d,p3),p2);    
		else if(2 == type)        
			ans= f(a,f(b,f(c,d,p3),p2),p1);    
		else if(3 == type)         
			ans= f(f(a,f(b,c,p2),p1),d,p3);    
		else        
			ans= f(a,f(f(b,c,p2),d,p3),p1); 
		if(ans==24.0)
			return true;
		return false;
	}
	public static void output(int p1, int p2, int p3, int type)
	{
		if(0 == type)        
			System.out.println("(("+(int)a + getOp(p1) + (int)b+ ")" + getOp(p2) + (int)c + ")" + getOp(p3) + (int)d);     
		else if(1 == type)        
			System.out.println("("+(int)a + getOp(p1) + (int)b + ")" + getOp(p2) + "(" + (int)c + getOp(p3) + (int)d + ")");   
		else if(2 == type)        
			System.out.println((int)a + getOp(p1)+"("+(int)b+getOp(p2)+"("+(int)c+getOp(p3)+(int)d+"))");    
		else if(3 == type)         
			System.out.println("("+(int)a+getOp(p1)+"("+(int)b+getOp(p2)+(int)c+"))"+getOp(p3)+(int)d);   
		else        
			System.out.println((int)a+getOp(p1)+"(("+(int)b+getOp(p2)+(int)c+")"+getOp(p3)+(int)d+")");
	}

}

