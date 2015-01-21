import java.util.*;
public class PrintPrimeNumbers {

	
	public static void printPrimes(int toRange)
	{
		Hashtable<Integer, String> table = new Hashtable<Integer, String>();
		int count = 2;
		while(count < toRange)
		{
			if(!table.containsKey(count))
			{
				System.out.print(count + " ");
			
				for(int i = count*2; i < toRange; i +=count)
				{
					table.put(i, "Not Prime");
				}
			}
			count++;
		}
	}
	
	public static void main(String[] args)
	{
		printPrimes(1000);
	}
}
