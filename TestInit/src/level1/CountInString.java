package level1;

public class CountInString {
	//문자열 내 p, y의 개수

	public static void main(String[] args) {
		
		
		String s = "pPoooyY";
		
			long cntP = s
					.chars()
					.filter(c -> c=='p' || c=='P')
					.count();
	
			long cntY = s
					.chars()
					.filter(c -> c=='y' || c=='Y')
					.count();
	
			
			if(cntP==cntY) System.out.println("true");
			else System.out.println("false");
		
	}
}
