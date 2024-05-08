package com.cg.testng;

import java.util.ArrayList;

public class Seleniumdouble {

	public static void main(String[] args) {
		int[]arr= {12,11,34,31,56,78,100};
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]%2==0)
			{
				System.out.println(arr[i]);
				//break;
			}
			else
			{
				System.out.println(arr[i]+"is not multiple by 2");
				//break;
			}
		}
		//Array list
		ArrayList<String> value=new ArrayList<String>();
		value.add("Nithya");
		value.add("Anitha");
		value.add("Narmatha");
		System.out.println(value.get(2));
		//System.out.println(value.remove(0));
		System.out.println(value.get(1));
	
		
		//print the size of the array
		for(int i=0;i<value.size();i++)
		{
			System.out.println(value.get(i));
		}
		System.out.println("**********");
		
		
		//Enhanced for loop
		for(String val:value){
			System.out.println(val);
		}
		
		//Item is present in ArrayList
		System.out.println(value.contains("Nithya"));
		System.out.println(value.contains("Rose"));
			
	
	

	
}
}
		

		


	



