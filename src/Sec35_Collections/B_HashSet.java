package Sec35_Collections;

import java.util.HashSet;
import java.util.Iterator;

public class B_HashSet {

	public static void main(String[] args) 
	{
		/**
		 * Set interface does not allow duplicate values unlike list interface.
		 * Set interface does not preserve the order of the elements. 
		 */
		
		HashSet<String>mainHashSet = new HashSet<String>();
		mainHashSet.add("Moisturiser");
		mainHashSet.add("serum");
		mainHashSet.add("lotion");
		mainHashSet.add("lotion");
		System.out.println(mainHashSet); //won't print and accept the duplicate value lotion.
		
		System.out.println(mainHashSet.isEmpty());
		
		mainHashSet.add("sunscreen");
		System.out.println(mainHashSet.remove("sunscreen"));
		
		System.out.println(mainHashSet.contains("sunscreen"));
		
		HashSet<String> subHashSet = new HashSet<String>(); //a subset of mainHashSet
		subHashSet.add("serum");
		System.out.println(subHashSet);
		
		//checking whether subHashSet is a subset of mainHashSet or not
		System.out.println(mainHashSet.containsAll(subHashSet));
		
		//Iterator Class. Used to iterate over a collection
		
		Iterator<String> itForHashSet = mainHashSet.iterator();
		
		while(itForHashSet.hasNext())
		{
			System.out.println(itForHashSet.next());
		}
		
	}

}
