
public class IntegerArrayFormat {

	
	public static void printFormat(int[] array, int numCols)
	{
		int x = array.length % numCols;
		int[][] print = new int[numCols][(int)Math.ceil((double)array.length / (double)numCols)];
		int colcounter = 0;
		int rowcounter = 0;
		for(int i = 0; i < array.length; i++)
		{
			print[colcounter][rowcounter] = array[i];
			if(rowcounter + 1 == array.length/numCols)
			{
				if(x > 0)
				{
					print[colcounter][rowcounter + 1] = array[i+1];
					i++;
					x--;
				}
				rowcounter = 0;
				colcounter++;
			}
			else
			{
				rowcounter++;
			}
			
		}
		for(int i = 0; i < print.length; i++)
		{
			for(int j = 0; j < array.length / numCols; j++)
			{
				System.out.print(print[j][i] + " ");
			}
			System.out.println();
		}
		for(int i = 0; i < array.length%numCols;i++)
		{
			System.out.print(print[i][array.length/numCols+1]);
		}
	}
	
	public static void main(String[] args) 
	{
		int[] array = {1, 2, 3, 4, 5, 6, 7};
		printFormat(array, 3);
	}

}
