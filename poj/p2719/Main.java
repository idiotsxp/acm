import java.util.Scanner;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in  = new Scanner(System.in);
		while(in.hasNext())
		{
			String str = in.nextLine();
			if(str.equals("0"))
				break;
			char ch[] = str.toCharArray();
			int result = 0;
			for(int i=0;i<ch.length;i++)
			{
				if(ch[i]>'4')
					ch[i]--;
			}
			for(int i=ch.length-1;i>=0;i--)
			{
				int j = ch.length-i-1;
				result += (ch[i]-'0')*Math.pow(9, j);
			}
			System.out.println(str+": "+result);
		}
	}

}

