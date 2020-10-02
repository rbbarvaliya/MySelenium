package OOPConceptPart2;

public interface UsBank {
	
	int min_bal = 100;
	
	public void credit();
	
	public void debit();
	
	public void transferMoney();
	
	//only method declaration
	//no method body - only method prototype
	//in interface, we can declare the variable, variable are by default static in nature
	//variable value will not be changed, its final/constant in nature.
	//no static method in interface 
	//no main method in interface
	//we can not create the object of interface
	//interface is abstract in nature 

}
