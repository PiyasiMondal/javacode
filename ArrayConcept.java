package basicProgramofJava;

//Assignment 71, 72,73, 74,75, 76,77,78
import java.util.Arrays;
import java.util.Scanner;

public class ArrayConcept {
	public static void main(String[] args) {
		int rollno[] = new int[4];
		rollno[0] = 85;
		rollno[1] = 86;
		rollno[2] = 87;
		rollno[3] = 88;
		// for(int i=0;i<=3;i++)
		// {
		// System.out.println(rollno[i]);
		// }
		// Array for int data type.
		System.out.println(Arrays.toString(rollno));
		String[] name = new String[5];
		name[0] = "Piya";
		name[1] = "Riya";
		name[2] = "Siya";
		name[3] = "Tiya";
		name[4] = "Kiya";
		// name[5]= "Liya"; //Exception : ArrayIndexOutOfBoundsException
		// Array for String data type.
		System.out.println(Arrays.toString(name)); // object is the root class of entire classhierarchy
		double salary[] = new double[5];
		salary[0] = 150000.34;
		salary[1] = 160000.34;
		salary[2] = 170000.34;
		salary[3] = 180000.34;
		salary[4] = 190000.34;
		// Array for double data type.
		System.out.println(Arrays.toString(salary));
		char alphabet[] = new char[5];
		alphabet[0] = 'A';
		alphabet[1] = 'E';
		alphabet[2] = 'I';
		alphabet[3] = 'O';
		alphabet[4] = 'U';
		// Array for double data type.
		System.out.println(Arrays.toString(alphabet));
		boolean value[] = new boolean[5];
		value[0] = true;
		value[1] = true;
		value[2] = true;
		value[3] = false;
		value[4] = false;
		// Array for double data type.
		System.out.println(Arrays.toString(value));
		// Take input in run time
		Scanner s = new Scanner(System.in);
		int age[] = new int[4];
		for (int i = 0; i <= 3; i++) {
			System.out.println("Enter value for index: " + i);
			age[i] = s.nextInt(); // values get assign from left to right
		}
		System.out.println(Arrays.toString(age));
		int agetoCompare[] = new int[4];
		for (int i = 0; i <= 3; i++) {
			System.out.println("Enter value for index: " + i);
			age[i] = s.nextInt();
			agetoCompare[i] = s.nextInt();
		}
		System.out.println(Arrays.toString(age));
		System.out.println(Arrays.toString(agetoCompare));
		// boolean b=Arrays.equals(age, agetoCompare);
		// if (b==true)
		// Check two arrays are equal
		if (Arrays.equals(age, agetoCompare) == true) {
			System.out.println("Arrays are equal");
		} else {
			System.out.println("Arrays are not equal");
		}
		int roll[] = new int[4];
		int given_no = 56;
		for (int i = 0; i <= 3; i++) {
			System.out.println("Enter value for index: " + i);
			roll[i] = s.nextInt();
			if (given_no == roll[i]) {
				System.out.println("yes the 56 number is present");
				System.out.println("indexing of 56: " + i);
			} else {
				System.out.println("No this is not same as given number");
			}
		}
		System.out.println(Arrays.toString(roll));
		// if(given_no==roll[i])
	}

}
