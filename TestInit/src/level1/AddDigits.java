package level1;

public class AddDigits {
	//�ڸ��� ���ϱ�
	
	public static void main(String[] args) {
		
		int num = 123;
		
		int sum = 0;
		
		while(num%10!=0 || num/10!=0)
		{
			sum += num%10;	
			num/=10;
		}
		sum+=num%10;
		
		
		System.out.println(sum);
		
	}
	
}
