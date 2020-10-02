package JavaBasics;

public class loopsConcept {

	public static void main(String[] args) {


		//1 while loop
		// disadvantage of while loop: it will generate infinite loop if you dont give incremental or decremenal 
		int i = 1;  //initialization
		while (i<10) {   // conditional 
			System.out.println(i);
			i=i+1;   // Incremental or decremental 
		}
		System.out.println("***********");
		//2 for loop
		for (int j=1; j<=10; j++) { //Initialization, conditional, incremental 
			System.out.println(j);
		}
		System.out.println("--------------");
		
		for (int j=10; j>=-10; j--) { //Initialization, conditional, incremental 
			System.out.println(j);
		}
	}

}
