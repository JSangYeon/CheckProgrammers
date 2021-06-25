package level2;

import java.util.PriorityQueue;

public class Spicy {
	//´õ ¸Ê°Ô
	
	public static void main(String[] args) {
	
		int[] scoville = {1, 2, 3, 9, 10, 12}; 
		int k = 11;
		
		System.out.println(solution(scoville,k));
	}
	
	public static int solution(int[] scoville, int k)
	{
		
		PriorityQueue<Integer> queue = new PriorityQueue<Integer>();
		for(int temp: scoville) queue.offer(temp);
				
		int cnt=0;
	
		while(queue.size()>=2 && queue.peek()<k)
		{
			queue.offer(queue.poll() + queue.poll()*2);
			cnt++;
		}
		if(queue.peek()<k) return -1;
		else return cnt;
	
	}

}
