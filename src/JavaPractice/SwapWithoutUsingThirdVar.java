package JavaPractice;

public class SwapWithoutUsingThirdVar {

	public static void main(String[] args) {


		int x = 5;
		int y = 10;
		
		//1.with using third variable.
//		 int t;
//		 t = x;
//		 x = y;
//		 y = t;
		
		//2.without using third variable

		x = x + y;
		y = x - y;
		x = x - y;
		
		System.out.println(x);
		System.out.println(y); 

	}

}
