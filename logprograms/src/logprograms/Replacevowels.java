package logprograms;

public class Replacevowels {

	public static void main(String[] args) {
		String str="nithya";
		char c[]=str.toCharArray();
		for(int i=0;i<c.length;i++) {
			if(c[i]=='a'||c[i]=='e'||c[i]=='i'||c[i]=='o'||c[i]=='u')
			{
			c[i]='*';	
			}
			
		}
		System.out.println(c);
	}

}
