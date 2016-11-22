package assignment_1;

class Bicycle
{
	public int cadence;
	public int Speed;
	public int gea;
	Bicycle(int Startcadence,int Speed2,int Gear)
	{   
		
		System.out.println("constructer is called base class ");
		cadence=Startcadence;
		Speed=Speed2;
		gea=Gear;
		System.out.println(cadence);
		System.out.println(Speed);
		System.out.println(gea);
	}
	
	
	
	
}
public class Parent {
	  
	public int cadence;
	public int Speed;
	public int gear;
	Parent(int a,int b,int c)
	{
		
	
		System.out.println(" constructer is of main class ");
	}
	public static void main(String[] args)
	{   
		
		Bicycle by=new Bicycle(2,3,4);
	}
	

}
