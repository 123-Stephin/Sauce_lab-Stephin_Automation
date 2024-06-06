package Stephinpractice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Basics2 {

	public static void main(String[] args) {
//		int arr[] = {1,4,5,2,6,7,8,3};
//		for(int i =0; i<arr.length;i++)
//		{
//			if(arr[i] % 2 == 0)
//			{
//				System.out.println(arr[i]);
//				//break;
//			}
//			else
//			{
//				System.out.println(arr[i] + " is not a multiple of 2");
//			}
//		}
		
		//ArrayList
		ArrayList<String> a = new ArrayList<String>(); //Only STring values
		a.add("Stephin");
		a.add("Dhanush");
		a.add("Rishabh");
		a.add("Sree");
		a.add("New");
		a.remove(4);
		
		//System.out.println(a.get(3));
		
		//normal method of for loop
		for(int i=0; i<a.size();i++)
		{
			System.out.println(a.get(i));
		}
		System.out.println("%%%%%%%%%%%%%###########");
		//enhanced method of for loop
		for( String val:a)
		{
			System.out.println("\n"+val);
		}

		//Checking the value is there or not in arraylist
		System.out.println(a.contains("Stephin"));
		
		
		String[] name = {"abc","cde","ecs","dwdc"};
		List<String> nameArrayList = Arrays.asList(name);
		System.out.println(nameArrayList);
		
	}

}
