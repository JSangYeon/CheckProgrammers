package level1;

import java.util.ArrayList;
import java.util.Arrays;

public class RemaniningZeroInteger {
	//나누어 떨어지는 숫자 배열
	
	public static void main(String[] args) {
		
		int[] arr = {2, 36, 1, 3};
		int divisor = 1;
		
		
		ArrayList<Integer> list = new ArrayList<Integer>();
		
		for(int temp : arr) {
			
			if(temp%divisor==0)
			{
				list.add(temp);
			}
			
		}
		
		
		if(list.size()>0)
		{
			int[] answer = list.stream().mapToInt(i -> i).toArray();
			Arrays.sort(answer);
			System.out.println(Arrays.toString(answer));
		}else {
			int[] answer = {-1};
			System.out.println(Arrays.toString(answer));
		}
	}

}
