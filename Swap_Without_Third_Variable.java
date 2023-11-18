package interview.level1programs;

public class Swap_Without_Third_Variable {

	public static void method1() {

		int a = 10;

		int b = 20;

		System.out.println("Before Swapping:");
		System.out.println("~~~~~~~~~~~~~~~~~~");
		System.out.println("a value is :" + a);
		System.out.println("b value is :" + b);

		a = a + b;

		b = a - b;

		a = a - b;

		System.out.println();
		System.out.println("After Swapping:");
		System.out.println("~~~~~~~~~~~~~~~~~~");
		System.out.println("a value is :" + a);
		System.out.println("b value is :" + b);

	}

	public static void method2(int a, int b) {

		System.out.println("Before Swapping:");
		System.out.println("~~~~~~~~~~~~~~~~~~");
		System.out.println("a value is :" + a);
		System.out.println("b value is :" + b);

		a = a + b;

		b = a - b;

		a = a - b;

		System.out.println();
		System.out.println("After Swapping:");
		System.out.println("~~~~~~~~~~~~~~~~~~");
		System.out.println("a value is :" + a);
		System.out.println("b value is :" + b);

	}

	public static void method3(int a, int b) {

		System.out.println("Before Swapping:");
		System.out.println("~~~~~~~~~~~~~~~~~~");
		System.out.println("a value is :" + a);
		System.out.println("b value is :" + b);

		a = a - b;

		b = a + b;

		a = b - a;

		System.out.println();
		System.out.println("After Swapping:");
		System.out.println("~~~~~~~~~~~~~~~~~~");
		System.out.println("a value is :" + a);
		System.out.println("b value is :" + b);

	}

	public static void main(String[] args) {

		method1();

	}

}
