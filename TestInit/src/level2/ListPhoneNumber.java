package level2;

import java.util.Arrays;

public class ListPhoneNumber {
	// 전화번호 목록
	
	public static void main(String[] args) {
		
		String[] phone_book = {"119", "97674223", "1195524421"};
		
		
		System.out.println(solution(phone_book));
	}
	
	public static boolean solution(String[] phone_book) {
		
		Arrays.sort(phone_book);

		System.out.println(Arrays.toString(phone_book));
		for(int i=0; i<phone_book.length-1; i++)
		{
			String phoneNum = phone_book[i];
			String temp = phone_book[i+1];
			
			if(temp.length()>= phoneNum.length() && temp.substring(0, phoneNum.length()).equals(phoneNum)) return false;
			
		}
		
		
		return true;
	}

}
