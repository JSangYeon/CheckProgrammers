package level1;

public class GetDateOfWeek {
	//2016³â
	
	public static void main(String[] args) {
	
		
		System.out.println(solution(5,24));
		
		
	}
	
	public static String solution(int a, int b) {
		int[] monthOfDays = {31, 29, 31, 30,31,30,31,31,30,31,30,31};  //1~12¿ù
		String[] MM ={"THU","FRI","SAT","SUN","MON","TUE","WED"};
		
		int days = 0;
	
		for(int i=0; i<a-1;i++)
		{
			days += monthOfDays[i];
		}
		
		StringBuilder sb = new StringBuilder();
		
		sb.append(MM[(days+b)%7]);
		
		return sb.toString();
	}
	
	

}
