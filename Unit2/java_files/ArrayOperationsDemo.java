import java.util.*;

public class ArrayOperationsDemo {
	static void print(int[] a) {
		for (int x : a) {
			System.out.println(x);
		}
	}

	public static void main(String[] args) {
		int[] arr = {5, 3, 2, 4, 1};
		print(arr);
	}
}