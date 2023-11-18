package interview.level1programs;

public class Palindrome_Word {
	
public static void main(String[] args) {
		
		
		
		String word = "malayalam";
		
		System.out.println("Original String: "+word);
		String rStr="";
		for (int i = word.length()-1; i >=0; i--) {
			
			char rev = word.charAt(i);
			
			rStr = rStr+rev;
			
		}
		
		System.out.println("After: "+rStr);
		
		if (word.equals(rStr)) {
			
			System.out.println(word+" is a Palindrome Word");
			
		}
		
		else {
			System.out.println(word+" is not a Palindrome Word");
			System.out.println("Reverse :"+rStr);
		}
	}


}
