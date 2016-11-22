package assignment_1;

import java.util.*;

public class Swapping {
	public static void main(String[] args) {
		int a = 11;
		int b = 12;

		Scanner scan = new Scanner(System.in);
		System.out.println("Enter value of a ");
		a = scan.nextInt();
		System.out.println("Enter value of b");
		b = scan.nextInt();

		System.out.println("number before swapping : a= " + a);// fake process
		System.out.println("number before swapping : b= " + b);// fake process
        
		a = a + b;
		b = a - b;
		System.out.println("b "+b);
		a = a - b;
		System.out.println("a "+a);
	}

}
