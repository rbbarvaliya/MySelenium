package OPPConceptPart1;

public class CallByValueAndCallBYReferance {
	
	int p;
	int q;

	public static void main(String[] args) {

		CallByValueAndCallBYReferance obj = new CallByValueAndCallBYReferance();
		int x = 10;
		int y = 20;
		obj.testSum(x,y);// call by value or pass by value
		
		obj.p = 50;
		obj.q = 60;
		
		obj.swap(obj);
		System.out.println(obj.q);
		System.out.println(obj.p);

	}
	
	public int testSum(int a, int b) {
		a = 30;
		b = 40;
		int c = a+b;
		return c;
		
	}
	
	public void swap(CallByValueAndCallBYReferance t) {
		int temp;
		temp = t.p;
		t.p = t.q;
		t.q = temp;
		
	}

}
