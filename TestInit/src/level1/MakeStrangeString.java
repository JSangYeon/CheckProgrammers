package level1;

public class MakeStrangeString {
	//이상한 문자 만들기
	
	public static void main(String[] args) {
		String s = "try hello world";
		
		boolean changeUpperCase = true;
		
		StringBuilder sb = new StringBuilder();
		
		for(int i=0; i<s.length(); i++)
		{
			int index = s.charAt(i);
			
			if((index>=65 && index<=90) || (index>=97&&index<=122)) // A~Z or a~z asciiCode
			{
				if(changeUpperCase)
				{
					sb.append(Character.toUpperCase(s.charAt(i)));
				}
				else {
					sb.append(Character.toLowerCase(s.charAt(i)));
				}
				
				changeUpperCase= !changeUpperCase;
			}
			else {
				sb.append(s.charAt(i));
				changeUpperCase = true;
			}
		
			
		}
	
		System.out.println(sb.toString());
		
	}


}
