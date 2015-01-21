
public class QuickSort {

	public static void quickSort(int[] A, int start, int end)
	{
		if((end - start) < 2) return;
		//PIVOT IS LAST ELEMENT OF ARRAY
		//CALCULATE NEXT PIVOT INDEX
		int pivotIndex = start;
		for(int i = start; i < end; i++)
		{

			if(A[i] <= A[end])
			{
				int temp = A[i];
				A[i] = A[pivotIndex];
				A[pivotIndex] = temp;
				pivotIndex++;
				
			}
		}
		int temp = A[pivotIndex];
		A[pivotIndex] = A[end];
		A[end] = temp;

		quickSort(A, start, pivotIndex - 1);

		quickSort(A, pivotIndex + 1, end);
		
	}
	
	public static void main(String args[])
	{
		int[] test = {3, 4, 2, 1, 8 ,99, 34, 24};
		quickSort(test, 0, test.length-1);
		for(int i = 0; i < test.length; i++)
		{
			System.out.print(test[i] + ",");
		}
	}
}
