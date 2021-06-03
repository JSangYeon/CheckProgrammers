package level1;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;

public class PickTwoAndAdd {
	// 두 개 뽑아서 더하기
	
	public static void main(String[] args) {
		int[] numbers = {2,1,3,4,1};
		
		HashSet<Integer> set = new HashSet<Integer>();
		
		for(int i=0; i<numbers.length; i++)
		{
			for(int j=i+1; j<numbers.length; j++)
			{
				set.add(numbers[i] + numbers[j]);
			}
		}

		int[] answer = new int[set.size()]; 
		Iterator<Integer> iter = set.iterator();
		
		for(int i=0; i<set.size(); i++)
		{
			answer[i] = iter.next();
		}

		Arrays.sort(answer);
		
	}
}
