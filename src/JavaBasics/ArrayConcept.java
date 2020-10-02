package JavaBasics;

public class ArrayConcept {

	public static void main(String[] args) {


		//array: to store similar data type in a array variable
		
		// 1 int array:
		int i[] = new int [4];
		i[0] = 10;
		i[1] = 20;
		i[2] = 30;
		i[3] = 40;
		
		System.out.println(i[2]);
		System.out.println(i[3]);		
		//System.out.println(i[4]);	//ArrayIndexOutOfBoundsException
		
		System.out.println(i.length);
		
		//print all  the value of array
		
		for (int j=0; j<i.length; j++) {
			System.out.println(i[j]);
		}
		
		double d [] = new double [3];
		d[0] = 12.33;
		d[1] = 13.44;
		d[2] = 45.55;
		
		System.out.println(d[2]);

		//Object array:
		Object ob [] = new Object [6];
		ob[0] = "Tom";
		ob[1] = 25;
		ob[2] = 12.33;
		ob[3] = "1/1/1990";
		ob[4] = "M";
		ob[5] = "london";
		
		System.out.println(ob[5]);
		System.out.println(ob.length);
		
		for(int p=0; p<ob.length; p++) {
			System.out.println(ob[p]);
		}
	}

}
