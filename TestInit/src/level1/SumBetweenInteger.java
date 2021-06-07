package level1;

public class SumBetweenInteger {
	//두 정수 사이의 합
	
	public static void main(String[] args) {
		int a = 5;
		int b = 3;
		
		
		if(a<=b)
		{
			System.out.println(getSum(a,b));
		}
		else {
			System.out.println(getSum(b,a));
		}
		
	}
	
	
	public static int getSum(int a, int b) {
		
		int sum =0;
		
		for(int i=a; i<=b; i++)
		{
			sum+=i;
		}
		
		return sum;
	}

}
