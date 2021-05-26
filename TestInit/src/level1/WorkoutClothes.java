package level1;

import java.util.Arrays;

public class WorkoutClothes {
//Ã¼À°º¹
	public static void main(String[] args) {
		
		int[] lost = {2,4,5,6,7,8};
		int[] reserve = {1,2,3,7,8,9,10};
		int n =10;
		System.out.println("result : " + solution(n,lost,reserve));
		
	}
	
	public static int solution(int n, int[] lost, int[] reserve) {

		int temp = 0;

		Arrays.sort(lost, 1, lost.length);
        for(int j=0;j<lost.length;j++)
        {
            for(int i=0; i<reserve.length;i++)
            {

            	if(lost[j]==reserve[i])
            	{
            		lost[j] = -1;
            		reserve[i]= -1;
            		temp++;
            		break;
            	}
               
            }
        }
        
       
        
        for(int j=0;j<lost.length;j++)
        {
        	
        	if(lost[j]==-1)
        	{
        		continue;
        	}
        	
            for(int i=0; i<reserve.length;i++)
            {
            	
            	if(reserve[i]-1==lost[j]||reserve[i]+1==lost[j])
                {
            		
            		System.out.println("lost[j] : " +lost[j]);
                    reserve[i] = -1;
                    break;
                }
            	if(i==reserve.length-1)
            	{
            		n-=1;
            	}
               
            }
           
        }
        
        
        return n;     
        

    }
}
