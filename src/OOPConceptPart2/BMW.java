package OOPConceptPart2;

public class BMW extends Car{// has a relationship
	
	//Method overriding: when same method is present in parent class as well child class with same name and same numbers of arguments.
	//is called method overriding 
	public void start() {
		System.out.println("BMW----start");
	}
	public void theftSafety() {
		System.out.println("BMW----theftSafety");
	}

}
