package com.cg.testng;

public class Datatype {

	public static void main(String[] args) {
		int value=5;
		String str="Nithya";
		double d=99;
		boolean b=true;
		System.out.println(value+" is a integer number");
		System.out.println("Nithya is a girl");
		System.out.println(str);


		//Array 1
		int[]arr=new int[5];
		arr[0]=1;
		arr[1]=2;
		arr[2]=3;
		arr[3]=4;
		arr[4]=5;
		System.out.println(arr[3]);

		//Array 2
		int[]arr2= {1,22,333,4444,55555,};
		System.out.println(arr[2]);	

		//for loop
		for(int i=0;i<arr.length;i++)
		{
			System.out.println(arr[i]);
		}
		for(int i=0;i<arr2.length;i++){
			{
				System.out.println(arr2[i]);
			}
			
		}
		
		//String
		String[] name= {"Nithya","Anitha","Narmatha"};
		for(int i=0;i<name.length;i++)
		{
			System.out.println(name[i]);
		}
		
		//Enhanced for loop
		for(String s:name)
		{
		System.out.println(s);
		}

	
}
}
