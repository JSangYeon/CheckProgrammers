package level1;

public class StringWatermelon {
	//���ڼ��ڼ��ڼ��ڼ��ڼ�?
	
	public static void main(String[] args) {
		System.out.println(solution(3));
	}
	
	public static String solution(int n) {
		
		StringBuilder sb = new StringBuilder();
		
		for(int i=0; i<n; i++) {
			if(i%2==0)
			{
				sb.append("��");
			}
			else {
				sb.append("��");
			}
			
		}
		
		return sb.toString();
	}

}
