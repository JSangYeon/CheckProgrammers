package level1;

import java.util.ArrayList;
import java.util.Collections;

public class FlipNum {
	//3진법 뒤집기

	
	public static void main(String[] args) {
	
		int n = 125;
		
		ArrayList<Integer> list = new ArrayList<>();
		
		
		while (n > 0) {
			list.add(n%3);
			n /= 3;		
		}

		int sum=0;
		
		for(int i=0; i<list.size();i++)
		{
			sum += list.get(i) * Math.pow(3, (list.size()-1)-i); 
			
		}
		
		System.out.println(sum);	//결과 출력
	}
	
	
}
