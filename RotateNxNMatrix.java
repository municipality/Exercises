
public class RotateNxNMatrix {

	//Rotate NxN Matrix in place clockwise
	public static void rotateNxNMatrix(int[][] matrix)
	{
		int n = matrix.length;
		for(int i = 0; i < n/2; i++)
		{
			for(int j = i; j < n-i-1; j++)//watch for bounding case
			{
				int temp = matrix[i][j];
				//4 cases, [i][j], [j][n-i-1], [n-i-1][n-j-1], [n-j-1][i]
				matrix[i][j] = matrix[n-j-1][i];//top row
				matrix[n-j-1][i] = matrix[n-i-1][n-j-1];//right side
				matrix[n-i-1][n-j-1] = matrix[j][n-i-1];//bottom side
				matrix[j][n-i-1] = temp;//left side
			}
		}
	}
	public static void main(String[] args) 
	{
		int[][] matrix = {{1, 2, 3, 4, 5, 6}, 
				{1, 2, 3, 4, 5, 6}, 
				{1, 2, 3, 4, 5, 6}, 
				{1, 2, 3, 4, 5, 6}, 
				{1, 2, 3, 4, 5, 6}, 
				{1, 2, 3, 4, 5, 6}};
		rotateNxNMatrix(matrix);
		for(int i = 0; i < matrix.length; i++)
		{
			for(int j = 0; j < matrix.length; j++)
			{
				System.out.print(matrix[i][j] + " ");
			}
			System.out.println();
		}
	}

}
