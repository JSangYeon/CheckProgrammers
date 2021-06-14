package level1;

import java.util.Arrays;

public class SecretMap {
	//비밀 지도
	public static void main(String[] args) {
		
		int n = 5;
		int arr1[] = {9, 20, 28, 18, 11};
		int arr2[] = {30, 1, 21, 17, 28};
		
		String[] answer = new String[n];
		
		for(int i=0; i<n; i++){
			StringBuilder sb = new StringBuilder();
			
			for(int j=0; j<n; j++)
			{
				
				if(arr1[i]%2==1 || arr2[i]%2==1) sb.append("#");
				else sb.append(" ");
				
				arr1[i] /=2;
				arr2[i] /=2;
			}
			
			answer[i] = sb.reverse().toString();
		}
		

		System.out.println(Arrays.toString(answer));
		
	}
}
