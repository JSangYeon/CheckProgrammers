package level1;

public class FindIndex {
	//서울에서 김서방 찾기
	
	public static void main(String[] args) {
		String[] seoul = {"Jane", "Kim"};
		
		
		int index =0;
		
		for(int i=0; i<seoul.length; i++)
		{
			String str = seoul[i];
			if(str.contains("Kim"))
			{
				index = i;
			}
			
		}
		
		StringBuilder sb = new StringBuilder();
		
		sb.append("김서방은 ");
		sb.append(index);
		sb.append("에 있다");
		
		System.out.println(sb.toString());
		
	}

}
