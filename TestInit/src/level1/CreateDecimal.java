package level1;

public class CreateDecimal {
	    
	
	//소수 만들기
	public static void main(String[] args) {
		
		int[] nums = {1,2,3,4};
		
		int length = nums.length;
		
		permutation(nums,0,3);
		
		
		
	}
	
	public static boolean checkDecimal(int num) { //소수 구하기
		
		boolean isDeciaml = true;
		
		 // 1은 소수도 합성수도 아니므로 i는 2부터 시작한다.
        // 2의 경우 반복문이 실행되지 않으므로 defalt값으로 실행된다.
        for (int i = 2; i < num; i++) {
            // 1과 num 자신 외에 나누어지는 수가 있는지 검사할 조건문
            if (num % i == 0) {
                // 나누어지는 수가 있을 경우 isPrime의 값을 true로 바꾼다.
            	isDeciaml = false;
                // 한 번이라도 이 조건문이 실행될 경우 num은 소수가 아니므로 반복문을 빠져나온다.
                break;
            }
        }
		
		return isDeciaml;
	}
	
	
	
	public static void permutation(int[] nums, int depth, int r) { 
		
        if (depth == r) {
            for (int i = 0; i < r; i++) {
                System.out.print(nums[i] + "\t");
            }
            System.out.println();
            return;
        }
        

        for (int i = 0; i < nums.length; i++) {
            int tmp = nums[i];
            nums[depth] = nums[i];
            nums[i] = tmp;

            permutation(nums, depth + 1, r);

            
//            //스왑한거 다시 되돌리기
            nums[i] = nums[depth];
            nums[depth] = tmp;
        }
    }
}
