package assignment_1;

public class BinaryInputAssingnment {
	public static void main(String []args)
	{
	int num =100;
	while(num!=0)
	{
		if(num%10>1)
		{
			System.out.println("false");
		}
		num=num/10;
	}
        System.out.println("true");
	}
}