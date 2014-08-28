import java.util.*;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		Map<String,Integer> map = new TreeMap();
		int n = in.nextInt();
		int m = in.nextInt();
		for(int i=0; i<n; i++)
		{
			map.put(in.next(), in.nextInt());
		}
		for(int i=0; i<m; i++)
		{
			int count = 0;
			while(in.hasNext())
			{
				String str = in.next();
				if(str.equals("."))
					break;
				if(map.containsKey(str))
					count += map.get(str);
			}
			System.out.println(count);
		}
		
	}

}

