package level1;

import java.util.Arrays;

public class GetAverage {
	//��� ���ϱ�
	public static void main(String[] args) {
		int[] arr = {1,2,3,4};
		
		double sum = 0;
		for(int temp : arr)
		{
			sum+=temp;
		}
		sum /= arr.length;
		
		
		System.out.println(sum);
		
		System.out.println(Arrays.stream(arr).average().orElse(0)); //��� ���
		
	}
}
