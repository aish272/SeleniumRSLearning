package Sec14_JavaStreams_PracticalUses;

import java.util.Arrays;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class E_JavaSreams_PrintUniqueNums {

	public static void main(String[] args) {
		// Print unique numbers from a list
		
		//My way. Collection the stream which has duplicate items in set because set will remove dupes.
		Set <Integer>s= Stream.of(1,2,33,33,6,7,6).collect(Collectors.toSet());
		System.out.println(s);
		
		//Lecture Video solution. Use distinct method from stream class.
		s.stream().distinct().forEach(uniqueNum->System.out.println(uniqueNum));

		
	}

}
