package level1;

public class CreateDecimal {
	    
	
	//�Ҽ� �����
	public static void main(String[] args) {
		
		int[] nums = {1,2,3,4};
		
		int length = nums.length;
		
		permutation(nums,0,3);
		
		
		
	}
	
	public static boolean checkDecimal(int num) { //�Ҽ� ���ϱ�
		
		boolean isDeciaml = true;
		
		 // 1�� �Ҽ��� �ռ����� �ƴϹǷ� i�� 2���� �����Ѵ�.
        // 2�� ��� �ݺ����� ������� �����Ƿ� defalt������ ����ȴ�.
        for (int i = 2; i < num; i++) {
            // 1�� num �ڽ� �ܿ� ���������� ���� �ִ��� �˻��� ���ǹ�
            if (num % i == 0) {
                // ���������� ���� ���� ��� isPrime�� ���� true�� �ٲ۴�.
            	isDeciaml = false;
                // �� ���̶� �� ���ǹ��� ����� ��� num�� �Ҽ��� �ƴϹǷ� �ݺ����� �������´�.
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

            
//            //�����Ѱ� �ٽ� �ǵ�����
            nums[i] = nums[depth];
            nums[depth] = tmp;
        }
    }
}
