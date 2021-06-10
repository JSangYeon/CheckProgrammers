package level1;

public class CoverCellPhoneNumber {
	//핸드폰 번호 가리기
	
	public static void main(String[] args) {
		String phoneNumber = "01033334444";
		
		StringBuilder sb = new StringBuilder();
		
		for(int i=0; i<phoneNumber.length()-4;i++)
		{
			sb.append("*");
		}
		sb.append(phoneNumber.substring(phoneNumber.length()-4));
		
		System.out.println(sb.toString());
	}

}
