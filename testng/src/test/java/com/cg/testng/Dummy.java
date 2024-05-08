package com.cg.testng;

public class Dummy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String str="Please use temporary password 'rahulshettyacademy' to Login.";
String[]s=str.split("'");
System.out.println(s.length);
for(int i=0;i<s.length;i++)
{
	System.out.println(s[i]);
}
	}

}
