package testing;

public class test {

	public static void main(String[] args) 
	{
		//Input: strs = ["flower","flow","flight"]
		//Output: "fl"
		String[] strs = {"flower","flow","flight"};
		String str1 = strs[0];
		String longestPrefix = "";
		for (int i=0; i< strs.length-1;i++)
		{
			
			for(int j=0; j<strs[i].length();j++)
			{
				String toMatch = strs[i].substring(j);
			if (strs[i+1].contains(toMatch))
			{
				longestPrefix = longestPrefix +toMatch;
				
			}
			else
			{
				break;
			}
			}
		}
		
       if (longestPrefix.length()==0)
       {
    	   System.out.println("Null");
       }
       else
       {
    	   System.out.println(longestPrefix);
       }
	}

}
