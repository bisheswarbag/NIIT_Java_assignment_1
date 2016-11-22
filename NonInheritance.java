package assignment_1;

interface CheckInterface {

	void display();

	void dance();
}

class NonInheritance implements CheckInterface {
	public void display() {
		System.out.println("defined here");
	}

	public void dance() {
		System.out.println("dance");
	}

	public static void main(String[] aa) {
		NonInheritance ci = new NonInheritance();
		ci.display();
		ci.dance();
	}

}
