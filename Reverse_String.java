package interview.level1programs;

public class Reverse_String {

	public static void reverse(String word) {

		System.out.println("Before Reverse: " + word);
		System.out.print("After Reverse : ");

		for (int i = word.length() - 1; i >= 0; i--) {
			
			char rev = word.charAt(i);

			System.out.print(rev);

		}

	}

	public static void reverse2(String word) {

		System.out.println("Before Reverse: " + word);
		System.out.print("After Reverse : ");
		String rStr = "";

		for (int i = 0; i < word.length(); i++) {
			rStr = word.charAt(i) + rStr;
		}

		System.out.println(rStr);
	}

	public static String reverse3(String word) {

		System.out.println("Before Reverse: " + word);
		System.out.print("After Reverse : ");

		String output = new String();

		char[] value = word.toCharArray();

		for (int i = value.length - 1; i >= 0; i--) {
			System.out.print(value[i]);
		}

		return output;

	}

	public static void reversewithBuilder(String word) {

		System.out.println("Before Reverse: " + word);
		System.out.print("After Reverse : ");

		StringBuilder sb = new StringBuilder(word);

		StringBuilder after = sb.reverse();

		System.out.println(after);

	}
	
	public static void reversewithBuffer(String word) {

		System.out.println("Before Reverse: " + word);
		System.out.print("After Reverse : ");

		StringBuffer sb = new StringBuffer(word);

		StringBuffer after = sb.reverse();

		System.out.println(after);

	}

	public static void main(String[] args) {
		
		reverse("Hello Java");

		// reverse3("Hello Java");

		//reversewithBuilder("Hello Java");
		
		//reversewithBuffer("Hello Java");
	}

}
