package level1;

public class StringHandlingDefault {
	//문자열 다루기 기본
	
	public static void main(String[] args) {
		String s = "1234";
		
		boolean answer = false;
		
		if((s.length()==4 || s.length()==6)&&s.matches("-?\\d+"))
		{
			answer = true;
		}
		
		System.out.println(answer);
	}

}
