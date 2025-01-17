package basicProgramofJava;

public class ThreadClass {
	// Assignment 30
	public static void main(String[] args) throws InterruptedException // Always add thread declaration
	{
		{
			for (int i = 1; i <= 10; i++) {
				System.out.println("Piyasi:" + i);
				Thread.sleep(1000); // Forcefully put your program on sleep.
			}

		}
	}
}
