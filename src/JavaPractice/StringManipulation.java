package JavaPractice;

public class StringManipulation {

	public static void main(String[] args) {


		String str = "The rains have started here selenium";
		String str1 = "The rains have started Here selenium";
		
		System.out.println(str.length());
		System.out.println(str.charAt(5));
		System.out.println(str.indexOf('s'));// 1st occurrence of s
	    System.out.println(str.indexOf('s', str.indexOf('s')+1));// 2nd occurrence  of s
	    System.out.println(str.indexOf('s', str.indexOf('s', str.indexOf('s')+1)+1));// 3rd occurrence of s
	    System.out.println(str.indexOf("have"));
	    System.out.println(str.indexOf("hello"));//-1
	    
	    //String comparison 
	    System.out.println(str.equals(str1));
	    System.out.println(str.equalsIgnoreCase(str1));
	    
	    //substring
	    System.out.println(str.substring(0, 9));
	    
	    //trim
	    String s = "  Hello World  ";
	    System.out.println(s.trim());
	    System.out.println(s.replace(" ", ""));
	    
	    String date = "01-01-2020";
	    System.out.println(date.replace("-", "/"));
	    
	    //Split
	    String test = "Hello_World_Test_Selenium";
	    String testval[] = test.split("_");
	    for (int i = 0; i<testval.length; i++) {
	    	System.out.println(testval[i]);
	    }
	    
	    		
	    String s2 = "cares";
	    System.out.println(s2.concat("a"));
	    
	    

	}

}
