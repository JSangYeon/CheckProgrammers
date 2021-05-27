package level1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;

public class FailureRate {
//������
	
	public static void main(String[] args) {
		int N = 5; //���������� ���� 1~500
		int[] stages = {2, 1, 2, 6, 2, 4, 3, 3}; //�����ڵ��� ���� ������ �������� ��ȣ 1�̻� N+1������ �ڿ���
		

		//���������� ���������� ���� Ŭ�������� ���� �÷��̾��� �� / ���������� ������ �÷��̾� ��
	
		System.out.println("result : " + Arrays.toString(solution(N,stages)));
	}
	
	 public static int[] solution(int N, int[] stages) {
	       
		 double currentSize = stages.length;
		 int[] answer = new int[N];
		
		 Map<Integer, Integer> mapStage = new HashMap<Integer, Integer>();

		 ArrayList<StageValue> listFailureRate = new ArrayList();
		 
		 for(int i=0; i<N;i++)
		 {
			 mapStage.put(i+1, 0);
			 
		 }
		 
		 for(int stage : stages)
		 {	
			 if(stage>N) continue;
			 mapStage.put(stage, mapStage.get(stage) +1 );
		 }

		 
		 for( Integer key : mapStage.keySet() ){
			    Integer value = mapStage.get(key);

		    	Double rate = 0.0;
			    
		    	if(value!=0)
		    	{
		    		rate = value/currentSize;
		    	}

		    	listFailureRate.add(new StageValue(key, rate));
		    	
		    	currentSize -= value;	    
			}
		 
	
		
		 Collections.sort(listFailureRate, comp);
		 
		  for(int i=0;i<listFailureRate.size();i++)
		  {
			  answer[i] = listFailureRate.get(i).getStage();
		  }
		
	     
	        return answer;
   }
	 
	 
	// Implement a reverse-order Comparator by lambda function
	static Comparator<StageValue> comp = (StageValue a, StageValue b) -> {

	     return b.getRateValue().compareTo(a.getRateValue());
	 };
	 
}


class StageValue {
	
	private int stage;
	private Double rateValue;
	
	StageValue(int stage, Double rateValue)
	{
		this.stage = stage;
		this.rateValue = rateValue;
	}

	public int getStage() {
		return stage;
	}

	public void setStage(int stage) {
		this.stage = stage;
	}

	public Double getRateValue() {
		return rateValue;
	}

	public void setRateValue(double rateValue) {
		this.rateValue = rateValue;
	}
	
	
}

