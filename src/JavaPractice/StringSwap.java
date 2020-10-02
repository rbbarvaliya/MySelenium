package JavaPractice;

public class StringSwap {

	public static void main(String[] args) {


		String a = "Hello";
		String b = "World";
		
		System.out.println("Value of a is "+ a);
		System.out.println("value of b is "+ b);
 
		//1.append a and b
		a = a+b;//HelloWorld
		
		//2. store initial String a in String b 
		b = a.substring(0, a.length()-b.length());
		
		//3.Store initial String b in string a
		
		a = a.substring(b.length());
		
	
		System.out.println("Value of a is "+ a);
		System.out.println("value of b is "+ b);
		
		
		
	}

}
