package logprograms;

public class Replace {

	public static void main(String[] args) {
		String str="Nithyanithya";
		str=str.replaceAll("[AEIOUaeiou]","*");
		System.out.println(str);

	}

}
