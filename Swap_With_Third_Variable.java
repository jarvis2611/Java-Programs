package interview.level1programs;

public class Swap_With_Third_Variable {

	public static void method1() {

		int a = 10;

		int b = 20;

		int temp;
		System.out.println("Before Swapping:");
		System.out.println("~~~~~~~~~~~~~~~~~~");
		System.out.println("a value is :" + a);
		System.out.println("b value is :" + b);

		temp = a;
		a = b;
		b = temp;

		System.out.println();
		System.out.println("After Swapping:");
		System.out.println("~~~~~~~~~~~~~~~~~~");
		System.out.println("a value is :" + a);
		System.out.println("b value is :" + b);

	}

	public static void method2(int a,int b) {

		
		int temp;
		
		System.out.println("Before Swapping:");
		System.out.println("~~~~~~~~~~~~~~~~~~");
		System.out.println("a value is :" + a);
		System.out.println("b value is :" + b);

		temp = a;
		a = b;
		b = temp;

		System.out.println();
		System.out.println("After Swapping:");
		System.out.println("~~~~~~~~~~~~~~~~~~");
		System.out.println("a value is :" + a);
		System.out.println("b value is :" + b);

	}

	public static void main(String[] args) {
		//method1();
		
		method2(23, 33);
	}

}
