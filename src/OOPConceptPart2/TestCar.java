package OOPConceptPart2;

public class TestCar {

	public static void main(String[] args) {
		
		//static polymorphism = compile time polymorphism
		
		BMW b = new BMW ();
		b.start();
		b.stop();
		b.refule();
		b.theftSafety();
		b.engine();
		
		System.out.println("------------");
		
		Car c = new Car();
		
		c.start();
		c.stop();
		c.refule();
		c.engine();
		
		System.out.println("@@@@@@@");
		
		//top casting 
		Car c1 = new BMW();//child class object can be referred by parent class reference variable== dynamic polymorphism or run time polymorphism
		c1.start();
		c1.stop();
		c1.refule();
		c1.engine();
		
	
		
		//down casting
		BMW b1 = (BMW)new Car();//IT will give classcastexception error
		

	}

}
