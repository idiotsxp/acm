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
			String str = in.nextLine();
			if(str.equals("ENDOFINPUT"))
				break;
			StringBuffer stb = new StringBuffer();
			while(!str.equals("END"))
			{
				if(!str.equals("START"))
					stb.append(str);
				str = in.nextLine();
			}
			char ch[] = stb.toString().toCharArray();
			for(int i=0; i<ch.length; i++)
			{
				if(ch[i]>='A'&&ch[i]<='Z')
				{
					if(ch[i]-5<'A')
						ch[i] = (char) (ch[i]+21);
					else ch[i] = (char) (ch[i]-5);
				}
			}
			System.out.println(ch);
		}
	}

}

