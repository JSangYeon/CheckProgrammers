package level1;

public class StringToInteger {
	//문자열을 정수로 변환
	
	public static void main(String[] args) {
		String num = "1234";
		
		
		if(num.substring(0,1).equals("-")) {
			
			System.out.println(-1*Integer.parseInt(num.substring(1)));
		} else if(num.substring(0,1).equals("+"))
		{
			System.out.println(Integer.parseInt(num.substring(1)));
		} 
		else {
			System.out.println(Integer.parseInt(num));
		}
		
		
	}

}
