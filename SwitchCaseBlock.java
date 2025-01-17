package basicProgramofJava;

import java.util.Scanner;

public class SwitchCaseBlock {

	// Assignment 33,34,47
	public static void main(String[] args) {
		switch (1)// Compile time passing the value
		{
		case 1:
			System.out.println("Option 1 is choosen");
			break;
		case 2:
			System.out.println("Option 2 is choosen");
			break;
		case 3:
			System.out.println("Option 3 is choosen");
			break;
		case 4:
			System.out.println("Option 4 is choosen");
			break;
		default:
			System.out.println("choose between 1 to 4");
		}
		System.out.println();
		System.out.println("To launch different brobser");
		System.out.println("Press 1 for Chrome");
		System.out.println("Press 2 for Edge");
		System.out.println("Press 3 for IE");
		System.out.println("Press 4 for Safare");
		Scanner S1 = new Scanner(System.in);
		int input = S1.nextInt();
		switch (input)// Run time passing the value
		{
		case 1:
			System.out.println("Option 1 is Chrome");
			break;
		case 2:
			System.out.println("Option 2 is edge");
			break;
		case 3:
			System.out.println("Option 3 is IE");
			break;
		case 4:
			System.out.println("Option 4 is Safare");
			break;
		default:
			System.out.println("choose between 1 to 4");
		}
		System.out.println();
		System.out.println("Enter your choice");
		for (int i = 1; i <= 4; i++) {
			Scanner C1 = new Scanner(System.in);
			int choice = C1.nextInt();
			System.out.println("Iteration number:" + i);
			switch (choice)// Run time passing the value
			{
			case 1:
				System.out.println("Option 1 is Chrome");
				break;
			case 2:
				System.out.println("Option 2 is edge");
				break;
			case 3:
				System.out.println("Option 3 is IE");
				break;
			case 4:
				System.out.println("Option 4 is Safare");
				break;
			default:
				System.out.println("choose between 1 to 4");
		
			}
		C1.close();
		S1.close();
		}
		
		
		
	}

}
