package level1;

public class SumDivisionNumber {
	//약수 더하기
	
	public static void main(String[] args) {
		int n = 12;
		
		int sum = n;
		for(int i=1; i<=n/2; i++)
		{
			if(n%i==0)
			{
				sum+=i;
			}
		}
		
		System.out.println(sum);
		
	}

}
