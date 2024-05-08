package com.cg.testng;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Testngflow {

	@Test()
	public void testMethod()
	{
		System.out.println("Execute test method");
	}
	@Test(groups="smoke")
	public void testMethod2()
	{
		System.out.println("Execute test method2");
	}
	@BeforeSuite()
	public void suitMethod()
	{
		System.out.println("Execute BeforesuitMethod");
	}
	@AfterSuite()
	public void aftersuitMethod()
	{
		System.out.println("Execute AftersuitMethod");
	}
	@BeforeTest()
	public void BeforeTestMethod()
	{
		System.out.println("Execute BeforeTestMethod");
	}
	@AfterTest()
	public void AfterTestMethod()
	{
		System.out.println("Execute AfterTestMethod");
	}
	@BeforeClass()
	public void BeforeClassMethod()
	{
		System.out.println("Execute BeforeClassMethod");
	}
	@AfterClass()
	public void AfterClassMethod()
	{
		System.out.println("Execute AfterClassMethod");
	}
	@BeforeMethod()
	public void beforeMethod()
	{
		System.out.println("Execute BeforeMethod");
	}
	@AfterMethod()
	public void afterMethod()
	{
		System.out.println("Execute AfterMethod");
	}	
}
