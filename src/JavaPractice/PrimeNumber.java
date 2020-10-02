package JavaPractice;

public class PrimeNumber {

	public static boolean isPrimenumber(int num) {
		 
		if(num<=1){
			return false;
		}
	    
		for (int i=2; i<num; i++){
			if(num % 1 == 0){
				return false;
			}
		}
		return true;
	}
	
	
	public static void main(String[] args) {


		System.out.println("2 is prime number "+ isPrimenumber(2));
		System.out.println("3 is prime number "+ isPrimenumber(3));
		System.out.println("21 is prime number "+ isPrimenumber(21));
		System.out.println("17 is prime number "+ isPrimenumber(17));

	}

}
