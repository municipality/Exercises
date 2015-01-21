
public class MaximumSubarray 
{
	public static int[] maxSubarray(int[] array)
	{
		int count = 0;
		int start = 0;
		int maxcount = 0;
		int maxstart = 0;
		int maxend = 0;
		
		for(int i = 0; i < array.length; i++)
		{
			count += array[i];
			
			if(count <= 0)
			{
				count = 0;
				start = i + 1;
			}
			else
			{
				if(count > maxcount)
				{
					maxcount = count;
					maxend = i;
					maxstart = start;
				}
			}
			
		}
		if(maxcount <= 0) return new int[0];
		
		int[] ret = new int[maxend - maxstart + 1];
		for(int i = maxstart; i <= maxend; i++)
		{
			ret[i-maxstart] = array[i];
		}
		
		return ret;
		
	}
	
	public static void main(String[] args)
	{
		//int[] array = {2, 1, -13, 4, -2, 4, -1};
		//int[] array = {-2, 11, -4, 13, -5, -2};
		int[] array = {-2, -3, -5};
		array = maxSubarray(array);
		for(int i = 0; i < array.length; i++)
		{
			System.out.print(array[i] + " ");
		}
	}

}
