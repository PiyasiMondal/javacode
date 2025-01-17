package basicProgramofJava;

public class LoopingConcept {

	static void For_Loop_Concept() {
		for_loop();
		Print_1to10_using_for_loop(); // Assignment 13
		Print_Minus10Plus10_using_for_loop(); // Assignment 14
		Print_Minus5toMinus15_using_for_loop();// Assignment 15
		Print_EvenNo_from_0to50_usingForLoop();// Assignment 16
		Print_OddNo_from_0to50_usingForLoop();// Assignment 17
		// InfiniteForLoop();
	}

	static void for_loop() {
		for (int i = 0; i <= 2; i++) {
			System.out.println("For loop running:" + i + ":times");
		}
	}

	static void Print_1to10_using_for_loop() {
		for (int i = 1; i <= 10; i++) {
			System.out.println("Iteration number:" + i);
		}
	}

	static void Print_Minus10Plus10_using_for_loop() {
		for (int i = -10; i <= 10; i++) {
			System.out.println("Print Value:" + i);
		}
	}

	static void Print_Minus5toMinus15_using_for_loop() {
		for (int i = -5; i >= -15; i--) {
			System.out.println("I Value:" + i);
		}
	}

	static void Print_EvenNo_from_0to50_usingForLoop() {
		for (int i = 2; i <= 50; i++) {
			System.out.println(i + ":Is an even Number");
			i++; // Inside the logic we used Increment operator.
		}
	}

	static void Print_OddNo_from_0to50_usingForLoop() {
		for (int i = 1; i <= 50; i++) {
			System.out.println(+i + ":Is an odd Number");
			i++;
		}
	}

	static void InfiniteForLoop() {
		for (int i = 1; i < 2; i--) {
			System.out.println("Iteration number:" + i);
		}
	}

	public static void main(String[] args) {
		For_Loop_Concept();
	}

}