package level1;

public class FindIndex {
	//���￡�� �輭�� ã��
	
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
		
		sb.append("�輭���� ");
		sb.append(index);
		sb.append("�� �ִ�");
		
		System.out.println(sb.toString());
		
	}

}
