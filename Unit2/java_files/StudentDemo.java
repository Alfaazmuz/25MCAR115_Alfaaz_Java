class Student {
	String name;
	int age;
	double marks;
	static String collegeName = "Christ";

	Student() {
		name = "Unknown";
		age = 18;
		marks = 0;
	}

	Student(String s, int a, double m) {
		name = s;
		age = a;
		marks = m;
	}

	void display() {
		System.out.println(name + " " + age + " " + marks + " " + collegeName);
	}
}

public class StudentDemo {
	public static void main(String[] args) {
		Student s1 = new Student();
		Student s2 = new Student("Kush", 22, 88.5);
		s1.display();
		s2.display();
	}
}