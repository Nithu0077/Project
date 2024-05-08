package logprograms;

public class Stringmethod {

	public static void main(String[] args) {
		String str="Nithya is a girl";
		System.out.println(str);
		String res=" ";
		for(int i =0;i<str.length();i++)//check N+ i+N=Ni Ni+t=Nit
		{
		res=str.charAt(i)+res;   
		}
		System.out.println(res);

	}

}
