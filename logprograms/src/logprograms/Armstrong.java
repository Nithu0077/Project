package logprograms;

public class Armstrong {

	public static void main(String[] args) 
	{
		int sumofcube=0,a,temp;
		int number=153;
		temp=number;
		while(number>0)
		{
			a=number%10;//Getting last digit
			number=number/10;//removing last digit from number 
			sumofcube=sumofcube+(a*a*a);//calculating sum of cube of digits
		}
		if (temp==sumofcube)
		{
			System.out.println(temp+"is an armstrong number");
		}
		
		else
		{
			System.out.println(temp+"is not an armstrong number");
		}	
		}
	}


