import java.util.Arrays;
import java.util.Collections;
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
			int n = in.nextInt();
			if(n==0)
				break;
			Integer array[] = new Integer[n];
			int max = 0;
			int count = 0;
			for(int i=0;i<n;i++)
			{
				array[i] = in.nextInt();
				if(array[i]>max)
					max = array[i];
			}
			count += max/50;
			if(max%50!=0)
				count++;
			for(int i=0;i<n;i++)
				array[i] = count*50-array[i];
			Arrays.sort(array, Collections.reverseOrder());
			int gray = in.nextInt();
			while(gray!=0)
			{
				if(array[2]!=0)
				{
					array[0]--;
					array[1]--;
					array[2]--;
					gray--;
					
				}
				else
				{
					for(int i=0;i<n;i++)
						array[i] += 50;
					count++;
				}
				Arrays.sort(array, Collections.reverseOrder());
			}
			System.out.println(count);
			
		}
	}

}

