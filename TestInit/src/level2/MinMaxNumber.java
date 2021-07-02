package level2;

import java.util.Arrays;

public class MinMaxNumber {
	//ÃÖ´ñ°ª°ú ÃÖ¼Ú°ª
	
	public static void main(String[] args) {
		
		String s = "1 2 3 -4";
		
		System.out.println(solution(s));
		
	}
	
	public static String solution(String s) {
		
		String[] temp = s.split(" ");
		
		int minNum = Integer.parseInt(temp[0]);
		int maxNum = Integer.parseInt(temp[0]);
		
		for(String str : temp) {
			int num = Integer.parseInt(str);
			
			if(minNum > num) minNum = num;
			
			if(maxNum < num) maxNum = num;
			
		}
		
		StringBuilder sb = new StringBuilder();
		
		sb.append(minNum);
		sb.append(" ");
		sb.append(maxNum);
		
		return sb.toString();
	}

}
