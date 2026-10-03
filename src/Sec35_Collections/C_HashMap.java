package Sec35_Collections;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class C_HashMap {

	public static void main(String[] args) {
		HashMap<Integer, String> rollNumStuName = new HashMap<Integer,String>();
		rollNumStuName.put(1, "Aish");
		rollNumStuName.put(2, "Aisha");
		rollNumStuName.put(3, "Aishwarya");
		rollNumStuName.put(4, "Golu");
		rollNumStuName.replace(4, "Golu","Gola");
		
		System.out.println(rollNumStuName.get(4));
		System.out.println(rollNumStuName.containsKey(9));
		System.out.println(rollNumStuName.containsValue("Aisha"));
		System.out.println(rollNumStuName.remove(5,"Gola")); //won't remove because Gola is mapped to 4
		
		Set <Entry<Integer, String>> mapToSet = rollNumStuName.entrySet();
		Iterator <Entry<Integer, String>>it = mapToSet.iterator();
		
		while(it.hasNext())
		{ 
			Map.Entry<Integer,String> mp = (Map.Entry<Integer,String>)it.next();
			System.out.println(mp.getValue());
			System.out.println(mp.getKey());
		}
		
		

	}

}
