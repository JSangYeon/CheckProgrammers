package level1;

public class StringHandlingDefault {
	//���ڿ� �ٷ�� �⺻
	
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
