package level2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class CreateBiggestNumber {
	//가장 큰 수
	
	public static void main(String[] args) {
		
		int[] numbers = {3, 30, 34, 5, 9};
		
		System.out.println(solution(numbers));
	}
	
	public static String solution(int[] numbers) {
		
		ArrayList<String> list = new ArrayList<String>();
		
		for(int num : numbers) {
			list.add(Integer.toString(num));
		}
		

		list.sort(new Comparator<String>() {@Override public int compare(String o1, String o2) {
			
			return (o2+o1).compareTo(o1+o2);
			
		}});
		
		
		StringBuilder sb = new StringBuilder();
		
		if(list.get(0).equals("0"))
		{
			return "0";
		}
		
		for(String temp : list)
		{
			sb.append(temp);
		}
		
		
		return sb.toString();
	}

}
