package level1;

public class CountInString {
	//���ڿ� �� p, y�� ����

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
