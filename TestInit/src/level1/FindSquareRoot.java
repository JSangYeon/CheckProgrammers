package level1;

public class FindSquareRoot {
	//Á¦°ö±Ù ÆÇº°
	
	public static void main(String[] args) {
		long n = 50000;
		long answer = 0;

	      if (Math.sqrt(n) == (int)Math.sqrt(n)){
	          answer = (long)Math.pow(Math.sqrt(n)+1, 2);
	      }else {
	          answer = -1;
	      }
	      System.out.println(answer);
	}

}
