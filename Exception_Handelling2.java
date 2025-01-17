package basicProgramofJava;

//Assignment 137,138,139
import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Exception_Handelling2 {
	public static void main(String[] args) {
		try {
			Scanner s = new Scanner(System.in);
			System.out.println("Entter the size of array");
			int rollno[] = new int[s.nextInt()];
			for (int i = 0; i < rollno.length; i++) {
				rollno[i] = s.nextInt();
			}
			System.out.println(Arrays.toString(rollno));
			System.out.println("I am in try block");
			s.close();
		} catch (InputMismatchException ip) {
			System.out.println("Size can only be int, Enter value");
			Scanner s = new Scanner(System.in);
			System.out.println("Entter the size of array");
			int rollno[] = new int[s.nextInt()];
			for (int i = 0; i < rollno.length; i++) {
				rollno[i] = s.nextInt();
			}
			System.out.println(Arrays.toString(rollno));
			System.out.println("I am in first catch block");
			s.close();
		} catch (NegativeArraySizeException ip) {
			System.out.println("Size can not be -ve, Enter +ve value");
			Scanner s = new Scanner(System.in);
			System.out.println("Entter the size of array");
			int rollno[] = new int[s.nextInt()];
			for (int i = 0; i < rollno.length; i++) {
				rollno[i] = s.nextInt();
			}
			System.out.println(Arrays.toString(rollno));
			System.out.println("I am in 2nd catch block");
			s.close();
		} finally {
			System.out.println("I am in Finally block");
		}

	}
}
