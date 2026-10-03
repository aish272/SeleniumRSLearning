package Sec14_JavaStreams_PracticalUses;

import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class D_JavaStream_Collectmethod {

	public static void main(String[] args) 
	{
		//collect method can be used as a terminal method to store a stream in any
		//collection type
		
		List <String> list = Stream.of("coca","moca","voca","mop").
				             filter(ele->ele.endsWith("a")).collect(Collectors.toList());
		System.out.println(list);
		
		
	}

}
