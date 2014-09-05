import java.util.Scanner;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int n = Integer.parseInt(in.nextLine());
		while(n-- > 0)
		{
			String str1 =new String(in.nextLine());
			String str11 = "";
			for(int i=0; i<str1.length(); i++)
			{
				if(str1.charAt(i)=='<')
				{
					str11 = str1.substring(i);
					break;
				}
			}
			String []a = str11.split(">");
			String []b = a[0].split("<");
			String []c = a[1].split("<");
			//System.out.print(Arrays.toString(b));
			//System.out.print(b.length);
			String d = b.length==0?"":b[1];
			String e = c.length==0?"":c[1];
			str11 = str11.replaceAll("<"+d+">", e).replaceAll("<"+e+">", d);
			//System.out.print(str11);
			String f = in.nextLine();
			System.out.println(str1.replaceAll("<", "").replace(">", ""));
			System.out.println(f.replace("...", str11));
		}
	}

}

