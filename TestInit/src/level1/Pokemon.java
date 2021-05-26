package level1;

import java.util.ArrayList;

public class Pokemon {
	//ÆùÄÏ¸ó
	public static void main(String[] args) {
	
		int[] nums = {3,1,2,3};
		
		System.out.println("nums : " +solution(nums));
		
	}
	
    public static int solution(int[] nums) {
    	
    	
    	ArrayList list = new ArrayList<>(); 
    	for(int number : nums)
    	{
    		if(!list.contains(number))
    		{
    			list.add(number);
    		}
    	}
    	
    	if(list.size()>=(nums.length/2))
    	{
    		return nums.length/2;
    	}else {
    		return list.size();
    	}
    	
    }
}
