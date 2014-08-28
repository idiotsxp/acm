import java.util.Scanner;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int a[] = {9,3,7};
		for(int i=0; i<n; i++)
		{
			String str = in.next();
			StringBuffer str2 = new StringBuffer(str).reverse();
			String str1 = str2.toString().replace('?', '0');
			int num = 0;
			int m = str2.toString().indexOf('?');
			for(int j=0; j<str1.length(); j++)
			{
				num += (str1.charAt(j)-'0')*a[j%3];
			}
			int f = (10-num%10)%10;
			for(int j=0; j<10; j++)
				if(j*a[m%3]%10==f)
				{
					str = str.replace('?', (char)(j+'0'));
					break;
				}
			System.out.println("Scenario #"+(i+1)+":\n"+str+"\n");
		}
			
	}

}

