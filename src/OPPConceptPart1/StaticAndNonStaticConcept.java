package OPPConceptPart1;

public class StaticAndNonStaticConcept {
	
	//Global variable: the scope global variable will be available across all the function with some condition. 
	
	String name = "Tom"; // Non static Global variable 
	static int age = 25;// static global variable 

	public static void main(String[] args) {

		//how to call static methods and variables
		//1 direct calling:
		sum();
		//2 calling by classname:
		StaticAndNonStaticConcept.sum();
		
		System.out.println(age);
		System.out.println(StaticAndNonStaticConcept.age);
		
		//How to call non static method and vars:
		StaticAndNonStaticConcept obj = new StaticAndNonStaticConcept();
		obj.sendMail();
		System.out.println(obj.name);
		
		//can I access static method by using object? yes
		obj.sum();// Warning will be given 
		
		
		
		}

	
	    public void sendMail() { // Nonstatic method
		    System.out.println("send mail method");
	    }
		public static void sum() { //static method
			System.out.println("sum Method");
		
	}

}
