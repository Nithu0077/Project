package logprograms;

public class Listobj {
	int i;

	public static void main(String[] args) {
		int[]arr= {100,200,300,400,500};
		//creating object for class 
		Listobj L=new Listobj();
		for(L.i=0;L.i<arr.length;L.i++)
			System.out.println(arr[L.i]);

	}

}
