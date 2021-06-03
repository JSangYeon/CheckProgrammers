package level1;

import java.util.Arrays;

public class Budget {

	public static void main(String[] args) {
		int[] d = {4,2,2,3,3};
		int budget = 10;
		
		Arrays.sort(d);
		
		int sum =0;
		int cnt = 0;
		
		for(int temp : d)
		{
			if(sum+temp<=budget)	{
				sum += temp;
				cnt++;
			}
			else	break;
		}
		System.out.println("cnt : " + cnt);
		
	
	}
	
}
