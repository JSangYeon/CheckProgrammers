package level1;

import java.util.Arrays;

public class IntervalNumber {
	//x��ŭ ������ �ִ� n���� ����

	public static void main(String[] args) {
		int x = 2;
		int n = 5;
		
		long[] answer = new long[n];
		long sum =0;
		
		for(int i=0; i<n; i++)
		{
			sum += x;
			answer[i] = sum;
		}
		System.out.println(Arrays.toString(answer));
	}
}