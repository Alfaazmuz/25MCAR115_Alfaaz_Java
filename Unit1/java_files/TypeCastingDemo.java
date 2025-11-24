class TypeCastingDemo {
	public static void main(String[] args) {
		int num = 10;
		double d = num;

		double v = 9.78;
		int x = (int) v;

		System.out.println("Implicit: " + d);
		System.out.println("Explicit: " + x);
	}
}