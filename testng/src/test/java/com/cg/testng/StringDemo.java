package com.cg.testng;

public class StringDemo {

	public static void main(String[] args) {
		StringDemo sd = new StringDemo();
		String name = sd.getData();
		//String name=getData();
		System.out.println(name);

	}
	//Using static method
	//public static String getData() {
	public String getData() {
		System.out.println("Hello World");
		return "Nithya";

	}

}
