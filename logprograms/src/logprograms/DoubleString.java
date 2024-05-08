package logprograms;

public class DoubleString {

	public static void main(String[] args) {
		String str = "Manual Automation";
		String first[] = str.split(" ");
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < str.length(); i++) {
			if (i < first[0].length()) {
				sb.append(first[0].charAt(i));
			}
			if (i < first[1].length()) {
				sb.append(first[1].charAt(i));
			}

		}

		System.out.println(sb);
	}

}
