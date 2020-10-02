package OOPConceptPart2;

public class HSBCBank implements UsBank, BrazilBank {// we are achieving multiple inheritance 
	//is a relationship
	
	
	//if a class implementing any interface, than its mandatory to define/override all the methods of interface.
	
	//over ridding from Usbank
	public void credit () {
		System.out.println("hsbc--- credit");
	}
	public void debit() {
		System.out.println("hsbc----debit");
	}
	public void transferMoney() {
		System.out.println("hsbc-----transferMoney");
	}
	//Separate method of HSBCBank
	public void educationLoan() {
		System.out.println("hsbc----educationloan");
	}
	public void carLoan() {
		System.out.println("hsbc----carloan");
	}
	//Brazil Bank--- over riding from brazil bank 
	public void mutualFund() {
		System.out.println("hsbc----mutual fund");
		
	}

}
