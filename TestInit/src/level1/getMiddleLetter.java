package level1;

public class getMiddleLetter {

	public static void main(String[] args) {
		
		String s = "abcde";
		int length = s.length();
		String answer;
		System.out.println("length : " +length);
		if(length%2==0)	answer = s.substring((length/2)-1,(length/2)+1);
		else answer = s.substring(length/2,length/2+1);
		System.out.println("answer : " + answer);
	}
}
