package JavaBasics;

public class TwoDimArray {

	public static void main(String[] args) {


		String x [][] = new String [3][5];
		
		System.out.println(x.length);//total number of raw
		System.out.println(x[0].length); //5 is total number of column 
		
		//1 raw
		x[0][0] = "A";
		x[0][1] = "B";
		x[0][2] = "C";
		x[0][3] = "D";
        x[0][4] = "E";
       
        //2 raw
        x[1][0] = "A1";
		x[1][1] = "B1";
		x[1][2] = "C1";
		x[1][3] = "D1";
        x[1][4] = "E1";
        
        //3 raw
        x[2][0] = "A2";
		x[2][1] = "B2";
		x[2][2] = "C2";
		x[2][3] = "D2";
        x[2][4] = "E2";
        
        System.out.println(x[1][2]);
        System.out.println(x[2][2]);
        
        //print all the value of 2D array
        System.out.println("***********");
        
        for (int raw=0; raw<x.length; raw++) {
        	for(int col=0; col<x[0].length; col++) {
        		System.out.println(x[raw][col]);
        	}
        
        }
        
	}

}
