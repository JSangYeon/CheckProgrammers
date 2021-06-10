package level1;

import java.util.ArrayList;
import java.util.Arrays;

public class RemoveIntegerDuplication {
	//정수 중복 제거
	
	public static void main(String[] args) {
		int[] arr = {1,1,3,3,0,1,1,1,1,1,1,1,2,2,1,1,1,1,1,2};
		
		ArrayList<Integer> list = new ArrayList<>();
		
		for(int i=0; i<arr.length;i++)
		{
			if(i==arr.length-1) list.add(arr[i]);
			
			for(int j=i+1; j<arr.length;j++)
			{
				if(arr[i] != arr[j])
				{
					list.add(arr[i]);
					i=j-1;
					break;
				}
			}			
		}

		int[] answer = list.stream().mapToInt(i -> i).toArray();
		System.out.println(Arrays.toString(answer));
	}

}
