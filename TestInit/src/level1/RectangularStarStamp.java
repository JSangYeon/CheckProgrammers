package level1;

public class RectangularStarStamp {
	// 직사각형 별 찍기

	public static void main(String[] args) {
		
		int a = 5;
		int b = 3;
		
		StringBuilder sb = new StringBuilder();
		
		for(int i=0; i<b; i++)
		{
			for(int j=0; j<a; j++)
			{
				sb.append("*");
			}
			sb.append("\n");
		}
		System.out.println(sb.toString());
	}
}
