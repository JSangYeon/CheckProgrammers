package level1;

public class HashadNumber {
	//ÇÏ»þµå ¼ö
	
	public static void main(String[] args) {
		
		System.out.println(solution(11));
	}
	
	public static boolean solution(int x) {

		int sum =0;
		int temp = x;
		
		while(temp!=0)
		{
			sum+=temp%10;
			temp/=10;
		}
		
		if(x%sum==0) return true;
		return false;
	}

}