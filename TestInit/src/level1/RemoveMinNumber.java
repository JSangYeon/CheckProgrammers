package level1;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class RemoveMinNumber {
	//제일 작은 수 제거하기
	
	public static void main(String[] args) {
		int arr[] = {4,3,2,1};
		
		int minNum = arr[0];
		int index = 0;
		
		List<Integer> list 
        = Arrays.stream(arr)
                .boxed()
                .collect(Collectors.toList());
		
		for(int i=0; i<arr.length-1; i++ )
		{
			if(minNum>arr[i+1])
			{
				minNum=arr[i+1];
				index = i+1;
			}
		}
		
		if(index==0)
		{
			int[] answer = {-1};
			System.out.println(Arrays.toString(answer));
		} else
		{
			list.remove(index);
			int[] answer = list.stream().mapToInt(i -> i).toArray();
			System.out.println(Arrays.toString(answer));
		}
	}

}
