package level2;

import java.util.Arrays;

public class Carpet {
	//Ä«Æê
	
	public static void main(String[] args) {
		
		int brown = 10; // °Ñ¸é
		
		int yellow = 2; // ¼Ó¸é
		
		System.out.println(Arrays.toString(solution(brown, yellow)));
	}
	
	
	public static int[] solution(int brown, int yellow) {
		
		int x= 0;
		
		int y = 0;
		
		for(x=2; x<=brown/2;x++)
		{
			y = brown/2 - x + 2;
			if(y<2) break;
			
			if((x+y-2)==brown/2 && (x-2)*(y-2) == yellow)	break;
		}
		
		
		int[] answer = {Math.max(x, y), Math.min(x, y)};
		
		return answer;
	}

}
