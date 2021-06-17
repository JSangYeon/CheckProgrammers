package level1;

public class CaesarPassword {
	//시저 암호
	
	public static void main(String[] args) {
		String s = "a f B z";
		int n = 25;
		
		System.out.println(solution(s,n));
	}
	
	public static String solution(String s, int n) {
		
		StringBuilder sb = new StringBuilder();
		
		for(int i=0; i<s.length(); i++)
		{
			
			int temp = (int) s.charAt(i);
			if(temp>=65&& temp<=90)
			{
				temp+=n;
				
				
				if(temp>90) temp-=26;
				
				sb.append((char)temp);
					
			}else if(temp>=97&&temp<=122) {

				temp+=n;
				
				if(temp>122) temp-=26;
				
				sb.append((char)temp);
			}
			else {
				sb.append(s.charAt(i));
				continue;
			}
				
		}
		
		return sb.toString();
	}

}
