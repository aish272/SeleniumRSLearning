package testing;


public class New {

	public static void main(String[] args) 
	{
		
		String str1 = "Java1.2.3";
		String str2 = "Java1.2.4";
		
		if(str1.length()==str2.length())
		{
			String lastChar1 = str1.substring(-1);
			String lastChar2 = str2.substring(-1);
			int v1 = Integer.parseInt(lastChar1);
			int v2 = Integer.parseInt(lastChar2);
			if (v1>v2)
			{
				System.out.println("Str1 is latest");			
			}
			else {
				System.out.println("Str2 is latest");
			}
		}
		
		
		
}
}
