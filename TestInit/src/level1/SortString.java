package level1;

import java.util.Arrays;
import java.util.Comparator;

public class SortString {
	// 문자열 내 마음대로 정렬하기
	static int i=0;
	
	public static void main(String[] args) {
		String[] strings = {"cdx","abce", "abcd","abc","cbad","abcdef" };
		int n = 1;
		
		Arrays.sort(strings, new Comparator<String>() {
			@Override
			public int compare(String str1, String str2) {
				
				char c1 = str1.charAt(n);
				char c2 = str2.charAt(n);
			
				if(str1.charAt(n)<str2.charAt(n)) return -1; //str1이 앞으로
				else if (str1.charAt(n)==str2.charAt(n)) return str1.compareTo(str2);
				else return 1; //str1이 뒤로
			}
		});
		
		System.out.println(Arrays.toString(strings));
		
	}

}
