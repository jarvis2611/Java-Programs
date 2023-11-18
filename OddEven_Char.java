package interview.level1programs;

public class OddEven_Char {
	
	    public static void main(String[] args) {
	        String input = "Christy";
	        //StringBuilder oddChars = new StringBuilder();
	        //StringBuilder evenChars = new StringBuilder();
	        
	        String oddChars="";
	        String evenChars="";

	        for (int i = 0; i < input.length(); i++) {
	            if (i % 2 == 0) {
	                evenChars=evenChars+input.charAt(i);
	            } else {
	                oddChars=oddChars+input.charAt(i);
	            }
	        }

	        System.out.println("Odd characters: " + oddChars.toString());
	        System.out.println("Even characters: " + evenChars.toString());
	    }
	

}
