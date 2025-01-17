package basicProgramofJava;

public class ContinueKeyword {
	// Assignment 32
	public static void main(String[] args) {
		int i;
		for (i = 1; i <= 10; i++) {
			if (i == 7 || i < 3) {
				continue;
			}
			System.out.println("Print value of i:" + i);
		}
	}

}
