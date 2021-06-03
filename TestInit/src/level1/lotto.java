package level1;

public class lotto {
	//로또의 최고 순위와 최저 순위

	public static void main(String[] args) {
		int[] lottos = {0, 0, 0, 0, 0, 0};
		
		int[] win_nums = {38, 19, 20, 40, 15, 25};
		
		int[] answer = new int[2];
		
		int bestCnt = 0;
		int worstCnt = 0;
		
		for(int num : lottos)
		{
			if(num==0)
			{
				bestCnt++;
				continue;
			}
			else {
				for(int winNum : win_nums)
				{
					if(winNum == num)
					{
						bestCnt++;
						worstCnt++;
						continue;
					}
					
				}		
				
			}
			
		}
		
		answer[0] = getRank(bestCnt);
		answer[1] = getRank(worstCnt);
		System.out.println("bestRank : " +(answer[0]) + ", worstRank : " + (answer[1]));
		
	}
	
	public static int getRank(int cnt) {
		
		if(7-cnt>=6)	return 6;
		else 	return 7-cnt;
		
	}
}
