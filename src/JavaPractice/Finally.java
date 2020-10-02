package JavaPractice;

public class Finally {

	public static void main(String[] args) {
         
		test1();
		

	}

	public static void test1() {
		
		try {
			System.out.println("inside the test1 method");
			throw new RuntimeException("test");
		}catch(Exception e) {
			System.out.println("inside the catch");
		}
		finally 
		{
			System.out.println("inside finally block");
		}
	}

}
