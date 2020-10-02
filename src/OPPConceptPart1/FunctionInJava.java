package OPPConceptPart1;

public class FunctionInJava {

	public static void main(String[] args) {
		
		FunctionInJava obj = new FunctionInJava ();
		//one object will be created , obj is the reference variable, referring to the object
		//after creating the object, the copy of all non static methods will be given to this object.
		//object can not hold the stating method
		
		obj.test();
		
		int l = obj.pqr();
		System.out.println(l);
		
		String s1 = obj.qa();
		System.out.println(s1);
		
		int div = obj.division(30, 10);
		System.out.println(div);



	}
	
     //non static Methods
	// void: dose not return any value.
	
	public void test() {//no input, no output
		System.out.println("test method");
	}
	
	public int pqr() {//no input , some output
		System.out.println("PQR method");
		int a = 10;
		int b = 20;
		int c = a+b;
		
		return c;
	}
	
	public String qa() {//no input , some output
		System.out.println("qa method");
		String s = "Selenium";
		
		return s;
	}
	
	//x and y input parameters or arguments
	public int division (int x, int y) {
		System.out.println("division method");
		int d = x/y;
		
		return d;
		
		
	}
}
