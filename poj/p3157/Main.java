import java.util.Scanner;

public class Main {
	public static String isC(String str)
	{
		if(str.endsWith("_"))
			return "error";
		if(str.startsWith("_"))
			return "error";
		if(str.charAt(0)>='A'&&str.charAt(0)<='Z')
			return "error";
		boolean a = false;
		boolean b = false;
		
		for(int i=0; i<str.length(); i++)
		{
			if(str.charAt(i)=='_'&&i!=0&&i!=str.length()-1)
				if(str.charAt(i-1)=='_'||str.charAt(i+1)=='_')
					return "error";	
			if(str.charAt(i)=='_')
				a = true;
			if(str.charAt(i)<='Z'&&str.charAt(i)>='A')
				b = true;
			
		}
		if(a)
			return "cpp";
		else if(b)
			return "java";
		else 
			return "both";
	}
	public static int checkType(String str)  
    {  
        if(str.endsWith("_"))  
            return -1;  
        if(str.startsWith("_"))  
            return -1;  
          
        if(str.indexOf("_") != -1)  
        {             
            for(int i = 0; i < str.length(); i++)  
            {  
                if((str.charAt(i) + 0) >= 65 && (str.charAt(i) + 0) <= 90)  
                    return -1;  
                if(str.charAt(i) == '_' && i != 0 && i != str.length()-1)  
                    if(str.charAt(i-1) == '_' || str.charAt(i+1) == '_')  
                        return -1;  
            }  
              
            return 1;  
        }  
      
        if(str.charAt(0) >= 65 && str.charAt(0) <= 90)  
            return -1;  
  
        return 2;  
    }  

	
	public static String javaToCpp(String str)
	{
		for(int i=0; i<str.length(); i++)
			if(str.charAt(i)<='Z'&&str.charAt(i)>='A')
				str = str.substring(0, i)+"_"+(char)(str.charAt(i)+32)+str.substring(i+1);
		return str;
	}
	public static String cppToJava(String str)
	{
		for(int i=0; i<str.length(); i++)
			if(str.charAt(i)=='_')
				str = str.substring(0, i)+(char)(str.charAt(i+1)-32)+str.substring(i+2);
			return str;
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		String str = in.nextLine();
		if(checkType(str)==-1)
			System.out.println("Error!");
		else
		{
			if(checkType(str)==2)
				System.out.println(javaToCpp(str));
			else 
				System.out.println(cppToJava(str));
		}
			
	}
}

