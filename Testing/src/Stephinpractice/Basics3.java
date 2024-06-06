package Stephinpractice;

public class Basics3 {

	public static void main(String[] args) {
		
		//String is an object //String literal, we cannot add same string values to another new variable in literal
		String s= "Hi all";
		String s1= "Hi all";
		
		//string with 'new' keyword, we can add same string values to another new variable in literal
		String s3 = new String("Hi all fellows");
		String s4 = new String("Hi all fellows");
		String s5 = new String("Hi all fellows");
		
		String[] splittedString =s.split("all");
		System.out.println(splittedString[0]);
		System.out.println(splittedString[0]);

		

	}

}
