package Sec14_JavaStreams_PracticalUses;

import java.util.ArrayList;
import java.util.stream.Stream;



public class A_JavaStreams {

	public static void main (String[] args) 
	{
		ArrayList<String> stringList = new ArrayList<String>();
		stringList.add("rohit");
		stringList.add("hithrow");
		stringList.add("amal");
		stringList.add("akal");
		stringList.add("prakal");
		int count =0;
		
		for(String string : stringList)
		{
			if(string.startsWith("a"))
			{
				count++;
			}
		}
		System.out.println("Count using for loop "+count);
		
		Long countOfStringswithPrefixA =  stringList.stream().filter(ele->ele.startsWith("a")).count();
		
		System.out.println("Count using stream "+countOfStringswithPrefixA);
		
		/**
		in filter method the expression can also be written inside {}, if there are multiple lines
		in the expression. Here we are returning false in the end which will mean there are 
		no elements with 'a' prefix. The output of ele.startsWith("a"); will be not used. hence 0 will be the o/p.
		Returning true will result in 4 as o/p. Hence both true and false will override the o/p.
		**/
		
		Long countOfStringWithAPrefix =  Stream.of("ana","anna","annanas","bananas").filter(ele->
		{
			ele.startsWith("a");
			return false;   // returning false will result in the output of count method as 5
		}).count();
		
		System.out.println("Count using a stream, created with 'of' method and Stream class "+countOfStringWithAPrefix);
		
		Stream.of("apache","ash","aish","car").filter(ele->ele.startsWith("a")).forEach(ele->System.out.println("printing using for each loop as a terminal condition "+ele));
		
		Stream.of("bala","baalu","cat").filter(ele->ele.startsWith("b")).limit(1).forEach(ele->System.out.println("Used limit() to only print 1 element: "+ele));
		
		
		
				
		
		
		
	}

}
