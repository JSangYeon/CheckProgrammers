package level1;

import java.util.Arrays;

public class AdditionOfMatrices {
	//Çà·ÄÀÇ µ¡¼À
	
	public static void main(String[] args) {
		
		int[][] arr1 = {{1,2},{2,3}};
		int[][] arr2 = {{3,4},{5,6}};
		
		solution(arr1, arr2);
	}
	
	public static int[][] solution(int[][] arr1, int[][] arr2)
	{
		int size = arr1[0].length;
		
		int[][] answer = new int[arr1.length][size];
		
		for(int i=0; i<arr1.length;i++)
		{
			for(int j=0; j<size; j++)
			{
				answer[i][j]= arr1[i][j] + arr2[i][j];
			}
		}
		
		return answer;
	}

}
