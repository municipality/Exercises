
import java.util.*;
public class Test {

	public static List findMissing2Numbers(List<Integer> a, int n)
	{
		int sum = 0;
		int squaresum = 0;
		List ret = new ArrayList<Integer>();
		for(int i = 0; i < a.size(); i++)
		{
			sum += a.get(i);
			squaresum += Math.pow(a.get(i), 2);
		}
		System.out.println("Sum: " + sum);
		System.out.println("Squaresum: " + squaresum);
		sum = n*(n+1)/2 - sum;
		squaresum = n*(n+1)*(2*n+1)/6 - squaresum;
		System.out.println("Sum: " + sum);
		System.out.println("Squaresum: " + squaresum);
		double aa = (2*sum + Math.sqrt(4*sum*sum - 8*(sum*sum-squaresum)))/4;
		double b = (2*sum - Math.sqrt(4*sum*sum - 8*(sum*sum-squaresum)))/4;
		ret.add(aa);
		ret.add(b);
		
		return ret;
	}
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		ArrayList<Integer> arraylist = new ArrayList<Integer>();
		
		Random rand = new Random();
		for(int i = 1; i <= 100; i++)
		{
			arraylist.add(i);
		}
		
		arraylist.remove(rand.nextInt(100));
		arraylist.remove(rand.nextInt(99));
		
		for(int i = 0; i < arraylist.size(); i++)
		{
			System.out.print(arraylist.get(i)+ " ");
		}
		System.out.println();
		
		List<Integer> miss = findMissing2Numbers(arraylist, 100);
		
		for(int i = 0; i < miss.size(); i++)
		{
			System.out.print(miss.get(i));
		}
	}

}
