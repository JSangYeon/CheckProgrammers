package level1;

import java.util.ArrayList;

public class CreateDecimal {
	    

	static ArrayList<Integer> list = new ArrayList<>();
	
	//소수 만들기
	public static void main(String[] args) {
		
		int[] nums = {1,2,7,6,4};
		
		int length = nums.length;
		
		boolean[] visited = new boolean[nums.length];		
		
		combination(nums, visited, 0, nums.length, 3);
		
		System.out.println(checkDecimal());;
		
		
	}
	
	public static int checkDecimal() { //소수 개수 구하기
		
		int cnt = 0;
		
		for(int num : list)
		{
			boolean isDecimal = true;
			for (int i = 2; i <= num/2; i++) {
	            if (num % i == 0) {
	            	isDecimal = false;
	                break;
	            }
	        }
			if(isDecimal)
			{
				cnt++;
			}
		}
        
		
		return cnt;
	}
	
	
	

	//arr- 배열, output - 조합에 뽑혔는지 체크하는 배열 , n - 배열의 길이, r - 조합의 길이, start - 변수의 기준
	// 백트래킹 사용
	// 사용 예시 : combination(arr, visited, 0, n, r)
	public static void combination(int[] arr, boolean[] visited, int start, int n, int r) {
		
	    if(r == 0) {
	    	list.add(getSum(arr, visited, n));
	    	return;
	    } 

	    for(int i=start; i<n; i++) {
	        visited[i] = true;
	        combination(arr, visited, i + 1, n, r - 1);
	        visited[i] = false;
	    }
	}

	
	  public static int getSum(int[] arr, boolean[] visited, int n) {
		  int sum =0;
		  for (int i = 0; i < n; i++) {
		      if (visited[i]) {
		    	  sum+=arr[i];
		      }
		  }
		  
		  return sum;
	}
}




//// 백트래킹 사용
//// 사용 예시 : combination(arr, visited, 0, n, r)
//public static void combination(int[] arr, boolean[] visited, int start, int n, int r) {
//    if(r == 0) {
//    	System.out.println(print(arr, visited, n));
//        return;
//    } 
//
//    for(int i=start; i<n; i++) {
//        visited[i] = true;
//        combination(arr, visited, i + 1, n, r - 1);
//        visited[i] = false;
//    }
//}

//// 배열 출력
//public static void print(int[] arr, boolean[] visited, int n) {
//    for (int i = 0; i < n; i++) {
//        if (visited[i]) {
//            System.out.print(arr[i] + " ");
//        }
//    }
//    System.out.println();
//}
