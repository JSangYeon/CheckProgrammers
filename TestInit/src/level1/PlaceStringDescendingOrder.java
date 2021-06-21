package level1;

import java.util.Arrays;
import java.util.Collections;

public class PlaceStringDescendingOrder {
	//���ڿ� ������������ ��ġ�ϱ�
	
	public static void main(String[] args) {
		String s = "Zbcdefg";
		
		System.out.println(solution(s));
	}
	
	public static String solution(String s) {
		
		Character [] arr = new Character [s.length()];
		
		for(int i=0; i<arr.length; i++) {
			arr[i] = s.charAt(i);
		}
		
		Arrays.sort(arr,Collections.reverseOrder());
		
		StringBuilder sb = new StringBuilder();
		
		for(int i=0; i<arr.length; i++) {
			sb.append(arr[i]);
		}
		
		return sb.toString();
	}

}
