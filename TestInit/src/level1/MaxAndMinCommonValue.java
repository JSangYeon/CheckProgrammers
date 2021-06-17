package level1;

import java.util.ArrayList;
import java.util.Arrays;

public class MaxAndMinCommonValue {
	//�ִ������� �ּҰ����
	
	public static void main(String[] args) {
		
		System.out.println(Arrays.toString(solution(2,5)));
	}
	
	public static int[] solution(int n, int m) {
		
		ArrayList<Integer> nDivisiorList = getDivisior(n);
		ArrayList<Integer> mDivisiorList = getDivisior(m);
	
		
		int commonDivisior = getCommonDivisior(nDivisiorList,mDivisiorList);
		int commonMultiple = getCommonMultiple(n, m, commonDivisior);
		
		
		int[] result = {commonDivisior, commonMultiple};
		
		return result;
	}
	
	public static ArrayList<Integer> getDivisior (int n){
		
		ArrayList<Integer> list = new ArrayList<>();
		
		for(int i=1; i<n/2+1;i++)
		{
			if(n%i==0) list.add(i);
		}
		list.add(n);
		
		return list;
	}
	
	public static int getCommonDivisior(ArrayList<Integer> nDivisiorList, ArrayList<Integer> mDivisiorList){ // �ּҰ����
		
		int commonDivisor = 1;
		
		for(int nDivisior : nDivisiorList) {
			
			for(int mDivisior : mDivisiorList) {
				
				if(nDivisior == mDivisior)
				{
					commonDivisor = nDivisior;
					break;
				}
				
			}
			
		}

		
		return commonDivisor;
		
	}
	
	public static int getCommonMultiple(int n, int m, int commonDivisior)
	{
		
		
		return (n/commonDivisior)*(m/commonDivisior)*commonDivisior;
	}
}
