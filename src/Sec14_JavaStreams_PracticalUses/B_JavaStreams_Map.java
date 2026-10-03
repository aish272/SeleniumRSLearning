package Sec14_JavaStreams_PracticalUses;

import java.util.Arrays;
import java.util.List;

public class B_JavaStreams_Map {

	public static void main(String[] args) {
		
		//Ex 1: print names which have last letter 'a' in uppercase format.
		System.out.println("Names which have last letter 'a' in uppercase format.");
		List<String> stringList = Arrays.asList("arra","rrra","aaa","rrr");
		stringList.stream().filter(ele->ele.endsWith("a")).map(ele->ele.toUpperCase()).
		forEach(ele->System.out.println(ele));
		
		//Ex 2: print names with prefix 'a' in uppercase format and sorted order.
		System.out.println();
		System.out.println("names with prefix 'a' in uppercase format and sorted order.");
		stringList.stream().filter(ele->ele.startsWith("a", 0)).sorted().map(ele->ele.toUpperCase()).
		forEach(ele->System.out.println(ele));
		
		
	}

}
