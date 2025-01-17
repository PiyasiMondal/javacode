package basicProgramofJava;

//Assignment 82
import java.util.Arrays;

public class ReverseArrayElement {
	public static void main(String[] args) {
		int input[] = new int[5];
		input[0] = 5;
		input[1] = 8;
		input[2] = 16;
		input[3] = 20;
		input[4] = 5;
		int output[] = new int[input.length];
		// output[4] =input[0];
		// output[3] =input[1];
		// output[2] =input[2];
		// output[1] =input[3];
		// output[0] =input[4];
		for (int i = 0, j = output.length - 1; i < input.length; i++, j--) {
			output[j] = input[i];
		}
		System.out.println(Arrays.toString(input));
		System.out.println(Arrays.toString(output));
	}

}
