package assignment_1;
import java.util.*;

public class Factorial {
	public static void main(String []args)
	{
	Scanner scan=new Scanner(System.in);
	System.out.println("enter a no ");
	int range=scan.nextInt();
	int factorial=1;
	for(int count=1;count<=range;count++)
	{
		factorial=factorial*count;
	}
	System.out.println(factorial);
	}

}
