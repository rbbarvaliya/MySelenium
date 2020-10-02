package OPPConceptPart1;

public class LocalvsGlobalVariable {
	
	//Global variable or class variable 
	String name = "Tom";
	int age = 25;

	public static void main(String[] args) {
		
		int i = 10;//local variable for main method
		System.out.println(i);
		
		LocalvsGlobalVariable obj = new LocalvsGlobalVariable ();
		System.out.println(obj.name);
        System.out.println(obj.age);
	}

	public void sum() {
		int i = 15;// local variable for sum method
		int j = 20;
		
		
	}
	
}
