package Sec35_Collections;

import java.util.ArrayList;

public class A_ArrayList {

	public static void main(String[] args) 
	{
		ArrayList<Integer> intArrayList = new ArrayList<Integer>();
		intArrayList.add(9);
		intArrayList.add(8);
		intArrayList.add(990);
		intArrayList.add(989);
		intArrayList.add(967);
		intArrayList.add(978);
		System.out.println(intArrayList.indexOf(8));
		System.out.println(intArrayList.get(0));
		System.out.println(intArrayList.remove(1));
		System.out.println(intArrayList.contains(967));
		System.out.println(intArrayList.isEmpty());
		System.out.println(intArrayList);
		
		ArrayList<Integer> willRetainValues = new ArrayList<>();
		willRetainValues.add(1);
		willRetainValues.add(990);
		willRetainValues.add(9);
		
		//this will retain all the values from the specified list 
		//and will remove all other that are not present in intArrayList.
		
		System.out.println(willRetainValues.retainAll(intArrayList)); 
		System.out.println(willRetainValues);
		
		
	}

}
