//Lecture 26

public class C_Sec3_String 
{
	public static void main(String[] args)
	{
		String str1 = new String("I'm Learning Selenium!");
		String[] Separated_string = str1.split(" ");
		System.out.println(Separated_string[0]);
		System.out.println(Separated_string[1]);
		System.out.println(Separated_string.clone()[2]);
		System.out.println(str1.charAt(0));
		System.out.println(str1.charAt(9));
	}
}
