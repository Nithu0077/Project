package com.cg.testng;

import io.opentelemetry.exporter.logging.SystemOutLogRecordExporter;

public class Stringmethod {

	public static void main(String[] args) {
		String s="Nithya Anitha Narmatha";
		//String[] splittedString=s.split("Anitha");
		String[] splittedString=s.split(" ");
		System.out.println(splittedString[0]);
		System.out.println(splittedString[1]);
		System.out.println(splittedString[2]);
		System.out.println(splittedString[1].trim());
		for(int i=0;i<s.length();i++)
		{
			System.out.println(s.charAt(i));
		}
		System.out.println("@@@@@@@@@@@");
		
		//Reverse String
		for(int i=s.length()-1;i>=0;i--)
		{
			System.out.println(s.charAt(i));
		}
		

	}

}
