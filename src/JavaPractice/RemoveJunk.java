package JavaPractice;

public class RemoveJunk {

	public static void main(String[] args) {


		String s = "#### latin string 01234567890";
		
		//Regular Expression: [^a-zA-z0-9]
		
		s =s.replaceAll("[^a-zA-z0-9]", "");
		System.out.println(s);
			
	}

}
