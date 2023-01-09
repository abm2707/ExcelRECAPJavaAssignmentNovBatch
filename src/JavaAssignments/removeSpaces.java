package JavaAssignments;

public class removeSpaces {

	public static void main(String[] args) {

		String s_before = "E x c e l R E C A P";  // String with spaces
		
		System.out.println("String with spaces is :" + s_before);
		
		String s_after = s_before.replaceAll("\\s", ""); // we are asking to replace
															// all the \\s - spaces with ""-- no space
		System.out.println("String without spaces is :" + s_after);

	}

}
