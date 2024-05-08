package logprograms;

public class Fibonacci {

	public static void main(String[] args) {
		int num1=0,num2=1,num3,i,count=10;
//print the value of num1,num2
		System.out.println(num1);
		
//print after 1 until 5 using for loop
		for(i=1;i<count;i++)
		{
			num3=num1+num2;
			System.out.println(""+num3);
			num1=num2;
			num2=num3;
		}
			
		
		
		

	}

}
 