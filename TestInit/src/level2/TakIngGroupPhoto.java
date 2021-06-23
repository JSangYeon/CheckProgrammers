package level2;

import java.util.HashMap;

public class TakIngGroupPhoto  {
	//단체사진 찍기
	static int cnt=0;
	
	public static void main(String[] args) {
		// {A, C, F, J, M, N, R, T} 첫 번째,세 번쨰 글자
		// ~ 두 번째 글자 
		// {=, <. >} 네 번째 글자 (같음, 미만, 초과)
		// 0 이상, 6 이하의 정수의 문자형 다섯 번째 글자 (조건에 제시되는 간격) 간격 - 두 프렌즈 사이에 있는 다른 프렌즈의 수
		
		
		int n = 2;
		String[] data = {"N~F=0", "R~T>2"};
		
		System.out.println(solution(2,data));
	}
	
	public static int solution(int n, String[] data)
	{
		int[] arr= {0,1,2,3,4,5,6,7};
		boolean[] visited = {false,false,false,false,false,false,false,false}; 
		
		HashMap<Character,Integer> map = new HashMap<>();
		map.put('A', 0);
		map.put('C', 1);
		map.put('F', 2);
		map.put('J', 3);
		map.put('M', 4);
		map.put('N', 5);
		map.put('R', 6);
		map.put('T', 7);
		
		
		
		int[] output = new int[8];

		perm(arr, output, visited, 0, 8, map, data);
		
		return cnt;
	}
	  
	// 순서를 지키면서 n 개중에서 r 개를 뽑는 경우
	// 사용 예시: perm(arr, output, visited, 0, n, 3);
	public static void perm(int[] arr, int[] output, boolean[] visited, int depth, int n, HashMap<Character,Integer> map, String[] data) {
	    if (depth == 8 && isOk(output,map,data)) {
	    	cnt++;
	        return;
	    }
	 
	    for (int i=0; i<n; i++) {
	        if (visited[i] != true) {
	            visited[i] = true;
	            output[depth] = arr[i];
	            perm(arr, output, visited, depth + 1, n, map, data);       
	            output[depth] = 0; // 이 줄은 없어도 됨
	            visited[i] = false;;
	        }
	    }
	}

	 // 배열 출력
    public static void print(int[] arr) {
        for (int i = 0; i < 8; i++)
            System.out.print(arr[i] + " ");
        System.out.println();
    }
    
    
    
    public static boolean isOk( int[] arr, HashMap<Character,Integer> map, String[] data){
        // 입력 받은 값 꺼내고 검사하자.
        
        
        for( int i=0; i<data.length; i++){
            int X = map.get( data[i].charAt(0) );     
            int Y = map.get( data[i].charAt(2) );
            char type = data[i].charAt(3);
            int diff = data[i].charAt(4) - '0';
            int Xpos = arr[X];
            int Ypos = arr[Y];
            if ( type == '='){    
                if ( Math.abs( Xpos - Ypos)-1 != diff){
                    
                    return false;
                }
                
            } else if ( type == '>'){
                if ( Math.abs(Xpos - Ypos )-1 <= diff){
                    
                    return false;
                }
                
                
            } else if ( type == '<') {
                if ( Math.abs(Xpos - Ypos )-1 >= diff){
                    
                    return false;
                }
            }
            
        }
        return true;
    }
    
}
