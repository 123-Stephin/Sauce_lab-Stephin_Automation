package Stephinpractice;

public class RevString {

	public static void main(String[] args) {

		String str="Stephin is a good boy";
		String ch="";
		for(int i=str.length()-1; i>=0;i--)
		{
			ch=ch+str.charAt(i);
		}
		System.out.println(ch);
	}

}
