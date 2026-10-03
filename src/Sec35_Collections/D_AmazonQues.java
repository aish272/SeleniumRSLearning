package Sec35_Collections;

import java.util.HashMap;

public class D_AmazonQues {

	public static void main(String[] args) 
	{
		int[] a = {4,7,4,7,9,8,4,8,10};
		HashMap<Integer, Integer>  numRepeat = new HashMap<Integer,Integer>();
		for(int i=0;i<a.length;i++)
		{
			if(!numRepeat.containsKey(a[i]))
			{
				numRepeat.put(a[i], 1);
			}
			else {
				numRepeat.replace(a[i], numRepeat.get(a[i])+1);
			}
		}
		System.out.println(numRepeat);
	}

}
