package assignment_1;

abstract class Animal {
	// non-abstract method
	public void shout() {

	}

	public abstract void eat();

}

class Dog extends Animal {
	public void shout() {
		System.out.println("dog ...Bhow Bhow");
	}

	public void eat() {
		System.out.println("Dog:- i eat with mouth");
	}
}

class Cat extends Animal {
	public void mew() {
		System.out.println("cat:- bhow bhow");
	}

	public void shout() {
		System.out.println("cat:- bhow bhow");

	}

	public void eat() {
		System.out.println(" cat i eat with mouth ");
	}
}

public class AbstractExample {
	public static void main(String[] aa) {
		Dog dog = new Dog();
		dog.shout();
		dog.eat();
		Cat cat = new Cat();
		cat.eat();
	}
}
