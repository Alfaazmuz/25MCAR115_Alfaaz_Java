class Person {
	public String name = "Alice";
	private int age = 25;
	protected String city = "Bengaluru";
	String country = "India";

	public void accessPrivate() {
		System.out.println(age);
	}
}

public class AccessDemo {
	public static void main(String[] args) {
		Person p = new Person();
		p.accessPrivate();
	}
}