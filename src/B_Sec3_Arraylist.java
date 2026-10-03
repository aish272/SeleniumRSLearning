//Lecture 25
//Refer: https://www.geeksforgeeks.org/initialize-an-arraylist-in-java/

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class B_Sec3_Arraylist {

	public static void main(String[] args) 
	{
		//ArrayList Initialization 1
		ArrayList <Integer> intArr = new ArrayList <Integer>();
		intArr.add(9);
		intArr.add(78);
		intArr.add(49);
		System.out.println(intArr.get(0));
		System.out.println(intArr);
		
		//ArrayList Initialization 2
	    ArrayList <Integer> intArr1 = new ArrayList <Integer>(Arrays.asList(2,7,8));
	    
	  //ArrayList Initialization 3
	    List <Integer> arr = new ArrayList<Integer>();
	    arr.add(9);
	    
	    ArrayList <Integer> intArr2 = new ArrayList <Integer>(arr);
	    
	    
	  //ArrayList Initialization 4   
	    ArrayList <Integer> intArr3 = new ArrayList <Integer>() {
	    	{
	    		add(8);
	    		add(9);
	    	}
    	};
    
    	 //ArrayList Initialization 4   
    	ArrayList <Integer> arr2 = new ArrayList <Integer> (List.of(8,9,90));
	    
		
		

	}

}
