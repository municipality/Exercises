import java.util.*;
public class MergeSort {

	public static int[] mergeSort(int[] A)
	{
		if(A.length < 2) return A;
		int left[] = Arrays.copyOfRange(A, 0, A.length/2);
		int right[] = Arrays.copyOfRange(A, A.length/2, A.length);
		return merge(mergeSort(left), mergeSort(right));
	}
	
	public static int[] merge(int[] A, int[] B)
	{
		int[] ret = new int[A.length + B.length];
		int a = 0, b = 0, r = 0;
		while(a < A.length && b < B.length)
		{
			if(A[a] < B[b])
			{
				ret[r] = A[a];
				a++;
				r++;
			}
			else
			{
				ret[r] = B[b];
				b++;
				r++;
			}
		}
		while(a < A.length)
		{
			ret[r] = A[a];
			r++;
			a++;
		}
		while(b < B.length)
		{
			ret[r] = B[b];
			r++;
			b++;
		}
		return ret;
	}
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		int[] test = {3, 4, 2, 1, 8 ,99, 34, 24};
		test = mergeSort(test);
		for(int i = 0; i < test.length; i++)
		{
			System.out.print(test[i] + ",");
		}
	}

}
