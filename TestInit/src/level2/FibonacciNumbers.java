package level2;

public class FibonacciNumbers {
	//피보나치 수
	
	public static void main(String[] args) {
		
		int n = 1000000;
		
		System.out.println(solution(5));
		
	}
	
	public static int solution(int n) {
		
		int first = 0;
		int second = 1;

		int num = 1;
		
		for(int i=0; i<=n-2; i++)
		{
			num = (first + second)%1234567;
			
			if(i%2==0)
			{
				first = num;
			}
			else if(i%2==1) {
				second = num;
			}
			
		}
		
		
		return num;
	}

}
