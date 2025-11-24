class Animal {
	void speak() {
		System.out.println("Animal");
	}
}

class Dog extends Animal {
	void speak() {
		System.out.println("Dog");
	}
}

public class InheritanceDemo {
	public static void main(String[] args) {
		Animal a = new Dog();
		a.speak();
	}
}