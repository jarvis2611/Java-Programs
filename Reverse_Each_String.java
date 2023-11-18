package interview.level1programs;

public class Reverse_Each_String {
	
	public static void reverse(String word) {
		
		System.out.println("Original Word: "+word);
		
		System.out.print("After Reverse: ");
		
		String rStr="";
		
		String[] allwords = word.split(" ");
		
		for (String eachWord : allwords) {
			
			String r="";
			
			for (int i = eachWord.length()-1; i>=0; i--) {
				
				char ar = eachWord.charAt(i);
				
				r=r+ar;
				
				
				
			}
			
			rStr=rStr+r+" ";
			
		}
		System.out.println(rStr);
	}
	
	public static void main(String[] args) {
		
		reverse("Hello World");
	}

}
