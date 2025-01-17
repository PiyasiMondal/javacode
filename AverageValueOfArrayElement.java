package basicProgramofJava;
//Assignment 81

public class AverageValueOfArrayElement {

	public static void main(String[] args)
	{
	double arrayelement[]=new double [5];
	arrayelement[0]=5;
	arrayelement[1]=8;
	arrayelement[2]=16;
	arrayelement[3]=20;
	arrayelement[4]=5;
	double sum=0;
	for(int i=0;i<arrayelement.length;i++)
	{
	sum=sum+arrayelement[i];
	}
	System.out.println("total value of array elements:"+sum);
	double avg=sum/arrayelement.length;
	System.out.println("Average value of array elements:"+avg);
	}
	
}
