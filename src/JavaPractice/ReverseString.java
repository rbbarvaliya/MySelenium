package JavaPractice;

public class ReverseString {

	public static void main(String[] args) {

        // Reverse a string 
		//diff b/w string and string buffe
		//do we have reverse function in java 

		String s = "Selenium";
		
		//1. using for loop
		int len = s.length();
		String rev = ""; 
		for (int i =len-1; i>=0; i--) {
			rev = rev + s.charAt(i);
		}
			System.out.println(rev);
		
		//2.using string buffer class
		StringBuffer sf = new StringBuffer(s);
		System.out.println(sf.reverse());
		
		
		
	}
}
