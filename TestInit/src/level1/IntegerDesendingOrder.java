package level1;

import java.util.ArrayList;

public class IntegerDesendingOrder {
	//���� ������������ ��ġ�ϱ�
	
	public static void main(String[] args) {
		long n = 118372;
		
		
		System.out.println(solution(n));
	}
	
	public static long solution(long n) {
		
		ArrayList<Long> list = new ArrayList<>();
		
		while(n!=0)
		{
			long temp = n%10;
			n/=10;
			list.add(temp);
		}
		
		list.sort(null);
		
		StringBuilder sb = new StringBuilder();
		
		for(int i= list.size()-1; i>=0; i--)
		{
			sb.append(list.get(i));
		}
		
		
		return Long.parseLong(sb.toString());
	}

}
