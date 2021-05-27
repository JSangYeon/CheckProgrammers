package level1;

import java.util.ArrayList;

public class CraneClawMachine {
	//크레인 인형뽑기
	
	public static void main(String[] args) {
		
		int[][] board = {{0,0,0,0,0}, {0,0,1,0,3}, {0,2,5,0,1}, {4,2,4,4,2}, {3,5,1,3,1}};
		int[] moves = {1,5,3,5,1,2,1,4};
		
		
		System.out.println("result : " + (solution(board, moves)));
		
		
	}
	
	 public static int solution(int[][] board, int[] moves) {
		
		 ArrayList<Integer> listToken = new ArrayList<>();
		 
		 for(int move : moves)
		 {
			 for(int i=0; i<board.length; i++)
			 {
				 if(board[i][move-1]!=0)
				 {
					 listToken.add(board[i][move-1]);
					 board[i][move-1] = 0;
					 break;
				 }
			 }
		 }
		 
		 
	        return removeSameToken(listToken, 0);
	 }
	 
	 public static int removeSameToken(ArrayList<Integer> listToken, int cnt)
	 {
		 
		 boolean removeCheck = false;
		 for(int i=0; i<listToken.size()-1; i++)
		 {
			 if(listToken.get(i) == listToken.get(i+1))
			 {
				 listToken.remove(i+1);
				 listToken.remove(i);
				 removeCheck = true;
				 cnt+= 2;
				 break;
			 }
		 }
		 
		 if(removeCheck) cnt = removeSameToken(listToken, cnt);

		 return cnt;
	 }

}
