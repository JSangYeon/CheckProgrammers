package level1;

import java.util.Arrays;

public class MockTest {
	//모의고사
	
	public static void main(String[] args) {
		
		int[] answers = {1,3,2,4,2};
		
		System.out.println("result : " + Arrays.toString(solution(answers)));
		
	}
	
	public static int[] solution(int[] answers) {
        int[] answer = {};
        
        int cntFirst = firstPattern(answers);
        int cntSecond = secondPattern(answers);
        int cntThird = thirdPattern(answers);
        
        
        if(cntFirst > cntSecond)
        {
        	if(cntFirst > cntThird)	answer = new int[] {1};
        	else if (cntThird > cntFirst) answer = new int[] {3};
        	else answer = new int[] {1,3};
        }
        else if (cntSecond > cntFirst)
        {
        	if(cntSecond > cntThird) answer = new int[] {2};
        	else if(cntThird> cntSecond) answer = new int[] {3};
        	else answer = new int[] {2,3};
        }
        else {
        	if(cntFirst> cntThird) answer = new int[] {1,2};
        	else if(cntThird> cntFirst) answer = new int[] {3};
        	else answer = new int[] {1,2,3};
        }
        
        
        
        return answer;
        
    }
	
	public static int firstPattern(int[] answers) { // 1 2 3 4 5 1 2 3 4 5 ...
		
		int cnt = 0;
		for(int i=0; i<answers.length; i++)
		{

			if((i%5+1) == answers[i])
			{
				cnt++;
			}
		}

		System.out.println("첫째의 정답 수 : " + cnt);
		return cnt;
	}
	
	public static int secondPattern(int[] answers) { // 2 1 2 3 2 4 2 5 2 1 2 3 2 4 2 5 ......
		
		int cnt = 0;
		
		for(int i=0; i<answers.length; i++)
		{
			int temp = 0;
			
			if(i%2==0)
			{
				temp = 2;
			}
			else {
				int choiceNumber = i%8+1;
				
				switch(choiceNumber){
					case 2:
					{
						temp = 1;
						break;
					}
					case 4:
					{
						temp = 3;
						break;
					}
					case 6:
					{
						temp = 4;
						break;
					}
					case 8:
					{
						temp = 5;
						break;
					}
				}
				
			}
			
			if(temp == answers[i])
			{
				cnt++;
			}
			
		}
		System.out.println("둘째의 정답 수 : " + cnt);
		
		return cnt;
	}
	
	
	public static int thirdPattern(int[] answers) { // 33 11 22 44 55 33 11 22 44 55 ...
		
		int cnt = 0;
		for(int i=0; i<answers.length; i++)
		{
			int check = i%10+1;
			int temp = 0;
			if(check>=1 && check<=2)
			{
				temp = 3;
			}
			else if (check>=3 && check<=4)
			{
				temp = 1;
			}
			else if (check>=5 && check<=6)
			{
				temp = 2;
			}
			else if (check>=7 && check<=8)
			{
				temp = 4;
			}
			else {
				temp = 5;
			}
			
			if(temp == answers[i])
			{
				cnt++;
			}
		}

		System.out.println("셋째의 정답 수 : " + cnt);
		return cnt;
	}

}
