package level1;

public class AddDivisorNumber {	
	//����� ���� Ȧ���� ���� ¦���� ���ϱ�
	
	public static void main(String[] args) {
		
		System.out.println(solution(13,17));
		
	}
	
	public static int solution(int left, int right) {
		
		int result = 0;
		
		for(int i=left; i<=right; i++)
		{
			int cnt = 0;
			for(int j=1; j<=i/2;j++)
			{
				if(i%j==0)
				{
					cnt++;
				}
			}
			cnt++;
			
			if(cnt%2==0)
			{
				result+=i;
			}else {
				result-=i;
			}
			
		}
		
		return result;
	}
	
}
