package level1;

import java.util.ArrayList;

public class CreateDecimal {
	    

	static ArrayList<Integer> list = new ArrayList<>();
	
	//�Ҽ� �����
	public static void main(String[] args) {
		
		int[] nums = {1,2,7,6,4};
		
		int length = nums.length;
		
		boolean[] visited = new boolean[nums.length];		
		
		combination(nums, visited, 0, nums.length, 3);
		
		System.out.println(checkDecimal());;
		
		
	}
	
	public static int checkDecimal() { //�Ҽ� ���� ���ϱ�
		
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
	
	
	

	//arr- �迭, output - ���տ� �������� üũ�ϴ� �迭 , n - �迭�� ����, r - ������ ����, start - ������ ����
	// ��Ʈ��ŷ ���
	// ��� ���� : combination(arr, visited, 0, n, r)
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




//// ��Ʈ��ŷ ���
//// ��� ���� : combination(arr, visited, 0, n, r)
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

//// �迭 ���
//public static void print(int[] arr, boolean[] visited, int n) {
//    for (int i = 0; i < n; i++) {
//        if (visited[i]) {
//            System.out.print(arr[i] + " ");
//        }
//    }
//    System.out.println();
//}
