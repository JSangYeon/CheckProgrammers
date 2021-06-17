package level1;

public class CollatzGuess {
	//콜라츠 추측
	
	public static void main(String[] args) {
		int num =626331;
		
		System.out.println(solution(num));
	}
	
	public static int solution(int num)
	{
		int cnt = 0;
		
		while(num!=1 && cnt<500)
		{
			if(num%2==0)
			{
				num/=2;
			}else if(num%2 ==1) { //else로 하면 안됨 실행 도중 num의 int범위 초과로 인해 -값 나옴
				num= num*3+1;
			}
			cnt ++;
			
		}

		if(cnt==500) return -1;
		return cnt;
	}

}
