package basicProgramofJava;

//Assignment 69
public class ReverseString_usingStringFunction {
	public static void main(String[] args) {
		String input = "Piyasi";
		String Output = "";
		char store;
		for (int i = input.length() - 1; i >= 0; i--) // i=3; store=d; Output=nothing+store=d
		{ // i=2;store=c; Output=d+c=dc
			store = input.charAt(i); // i=1; store=b;Output=dc+b=dcb
			Output = Output + store; // i=0; store=a;Output=dcb+a=dcba
		}
		System.out.println(Output);
	}
}
