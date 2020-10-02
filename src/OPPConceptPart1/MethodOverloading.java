package OPPConceptPart1;

public class MethodOverloading {

	public static void main(String[] args) {

		MethodOverloading obj = new MethodOverloading();
		obj.sum();
		obj.sum(10);
		obj.sum(10, 5);

	}
	//we can overload main method as well
	//you can not creat method inside the method 
	//duplicate method:---- same method name with same number of arguments are allowed 

	//method overloading --- when method name is same with diff argument or input parameter with in the same class. 
	public void sum() {// o input parameter
		System.out.println("sum method---zero parameter");
	}
	
	public void sum(int i) {// 1 input parameter
		System.out.println("sum method---- 1para");
		System.out.println(i);
	}
	public void sum (int k, int l) {// 2 input parameters
		System.out.println("sum method-----2 para");
		System.out.println(k+l);
	}
}

