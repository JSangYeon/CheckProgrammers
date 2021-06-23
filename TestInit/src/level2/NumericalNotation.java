package level2;

public class NumericalNotation {
	//124 나라의 숫자
	
	public static void main(String[] args) {
		int n = 11;
		
		System.out.println(solution(n));
	}
	
	public static String solution(int n) {
		
		 String[] numbers = {"4", "1", "2"};
	     String answer = "";
	      
	     int num = n;
	      
	     while(num > 0){
	         int remainder = num % 3;
	         num /= 3;
	          
	         if(remainder == 0) {
	        	 num--;
	         }
	          
          answer = numbers[remainder] + answer;
          }
	      
	      return answer;
	}
	
	

}
