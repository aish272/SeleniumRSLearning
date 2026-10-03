package Sec14_JavaStreams_PracticalUses;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

import org.testng.Assert;


public class C_JavaStreams_Merging2lists {

	public static void main(String[] args) 
	{
		ArrayList <String> stream1 = new ArrayList<String>();
		stream1.add("poo");
		stream1.add("boo");
		stream1.add("coo");
		
		List <String> stream2  =  Arrays.asList("crew","chew","mew");
		
		Stream<String> concatenatedStream = Stream.concat(stream1.stream(), stream2.stream());
		Boolean iscooPresent = concatenatedStream.anyMatch(ele->ele.equalsIgnoreCase("coo"));
		Assert.assertTrue(iscooPresent);
		System.out.println(iscooPresent);
	}

}
