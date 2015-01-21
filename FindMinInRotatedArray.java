
public class FindMinInRotatedArray {
	
	public static int findMinInRotatedArray(int[] array)
	{
		//USING BINARY SEARCH METHOD
		int a = 0;
		int b = array.length/2;
		int c = array.length - 1;
		if(array[a] < array[b] && array[b] < array[c])
		{
			return array[a];
		}
		while(true)
		{
			if(array[a] > array[b]) // RESET IS BETWEEN index a AND index b
			{
				c = b;
				b = (a + c)/2;
			}
			else if(array[b] > array[c])
			{
				a = b;
				b = (a + c)/2;
			}
			if(b - a <= 1 && c - b <= 1)
			{
				return Math.min(array[a], Math.min(array[b], array[c]));
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] test = { 4, 5, 6, 7, 8, 1, 2, 3};
		System.out.println(findMinInRotatedArray(test));
	}

}
