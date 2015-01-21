import java.io.*;
public class Main {
	static int counter = 0;
	public static void main(String[] args) throws IOException
	{
        File file = new File(args[0]);
        BufferedReader buffer = new BufferedReader(new FileReader(file));
        String line;
        while ((line = buffer.readLine()) != null) 
        {
            line = line.trim();
            // Process line of input Here
            counter = 0;
            for(int i = 1; i <= line.length(); i++)
            {
            	String s = line.substring(0, i);
            	int num = Integer.parseInt(s);
            	do_this(num, line.substring(i));
            }
            System.out.println(counter);
        }

	}
	
	public static void do_this(int first, String sec)
	{
		int second = 0;
		if(sec.equals("") || (second  = Integer.parseInt(sec)) < 10)
		{
			if(second != 0)
			{
				if(isUgly(first + second))
					counter++;
				if(isUgly(first - second))
					counter++;
			}
			else if(isUgly(first))
			{
				counter++;
			}
			
			return;
		}

		for(int i = 2; i <= sec.length(); i++)
        {
        	String s = sec.substring(0, i);
        	int num = Integer.parseInt(s);
        	do_this(first + num, sec.substring(i));
        	do_this(first - num, sec.substring(i));
        }
		
		do_this(first + Character.getNumericValue(sec.charAt(0)) , sec.substring(1));
		do_this(first - Character.getNumericValue(sec.charAt(0)), sec.substring(1));

		
	}
	
	public static boolean isUgly(int a)
	{
		if(a%2 == 0 || a%3 == 0 || a%5 == 0 || a%7 == 0 || a == 0)
			return true;
		return false;
	}

}
