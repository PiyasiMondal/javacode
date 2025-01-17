package basicProgramofJava;

//Assignment 70
public class String_isPalimdrome_Check_UsingStringFunction {
	public static void main(String[] args) {
		String input = "Madam";
		String output = "";
		for (int i = input.length() - 1; i >= 0; i--) {
			char storeIndex = input.charAt(i);
			output = output + storeIndex;
		}
		if (input.equalsIgnoreCase(output) == true) {
			System.out.println("Input " + input + " is palendrome");
		} else {
			System.out.println("Input " + input + " is not palendrome");
		}
	}

}
