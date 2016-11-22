package assignment_1;

import java.util.*;

public class MagicNumberSum {
	public static void main(String[] args) {
		MagicNumberSum mg = new MagicNumberSum();

	
	}
	Scanner scan=new Scanner(System.in);
	

	int num = 100;
	int rem;
	int sum = 0;
	void calcullation1()
	{
		num = sum;
		sum = 0;
		for (int count = 0; count <= num; count++) 
		{
			rem = num % 10;
			sum = sum + rem;
			num = num / 10;
		}
		System.out.print("sum \t" + sum);
		
	}
	{
		
		for (int count = 0; count <= num; count++) {
			rem = num % 10;
			sum = sum + rem;
			num = num / 10;
		}
		if (sum > 10)
	 		
	    	{
			
			calcullation1();
		}
		else  
		{
			System.out.println(" this is not a magic" );
		}
		if (sum > 10)
		{
	
			calcullation1();
			}
		
		System.out.print("sum \t"+sum);
        System.out.println("not a magic no.");}

}


