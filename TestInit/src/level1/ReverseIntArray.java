package level1;

import java.util.Arrays;

public class ReverseIntArray {
	// 자연수 뒤집어 배열로 만들기
	
	public static void main(String[] args) {
		
		long n = 12345;
		
		System.out.println(Arrays.toString(solution(n)));
	}
	
	public static int[] solution(long n) {
		int size =0;
		long temp = n;
		
		while(temp!=0)
		{
			size++;
			temp/=10;
		}
		
		int[] answer = new int[size];
		
		temp = n;
		int i=0;
		
		while(temp!=0)
		{
			answer[i] = (int) (temp%10);
			temp/=10;
			i++;
		}
		
		
		
		return answer;
	}

}
