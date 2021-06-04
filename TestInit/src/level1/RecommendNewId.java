package level1;

public class RecommendNewId {
	//�ű� ���̵� ��õ
	
	public static void main(String[] args) {
		String new_id = "=.=" ;
		
		new_id= new_id.toLowerCase(); //1�ܰ�
		
		new_id = new_id.replaceAll("[^a-z0-9-_.]",""); //2�ܰ�
		
		
		new_id = removeDuplicatedChar(new_id); //3�ܰ�
		
		new_id = removeFirstChar(new_id);  //4�ܰ�
		new_id = removeEndChar(new_id); 
		
		if(new_id.isEmpty()) new_id ="a"; //5�ܰ�
		
		if(new_id.length()>=16) new_id = new_id.substring(0,15);
		new_id = removeEndChar(new_id); //6�ܰ�
		
		if(new_id.length()<=2) //7�ܰ�
		{
			while(new_id.length()<3) {
				new_id += new_id.charAt(new_id.length()-1);
			}
			
		}
		
		System.out.println(new_id);
		
		
		
	}
	
	public static String removeDuplicatedChar(String temp) {
		if(temp.length()==0) return temp;
		
		int lastIndex = temp.indexOf("..");
		while(lastIndex !=-1)
		{
			
			temp = temp.replace("..", ".");
			
			
			lastIndex = temp.indexOf("..");
			
		}

		
		return temp;
		
	}
	
	public static String removeFirstChar(String temp) {

		if(temp.length()==0) return temp;
		
		if(temp.indexOf(".") ==0)
		{
			temp = temp.substring(1);
		}
		
		
		return temp;
	}
	
	public static String removeEndChar(String temp) {

		if(temp.length()==0) return temp;
		
		if(temp.lastIndexOf(".") == temp.length()-1)
		{
			temp =temp.substring(0,temp.length()-1);
		}
		return temp;
	}
}
