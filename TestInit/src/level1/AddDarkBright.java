package level1;

public class AddDarkBright {
	//������ϱ�
	
	public static void main(String[] args) {
		int[] absolutes = {4, 7, 12};
		boolean[] signs = {true, false, true};
		
		System.out.println("result : " + solution(absolutes,signs));
		
	}
	
	 public static int solution(int[] absolutes, boolean[] signs) {
		 //signs �� true�� ��, false�� ��
	        int answer = 0;
	 
	        
	        for(int i=0; i<absolutes.length; i++)
	        {
	        	if(signs[i]) answer+=absolutes[i];
	        	else answer-=absolutes[i];
	        }
	        
	        return answer;
	 
	 
	 }
	 
	 
}
