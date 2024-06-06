package Stephinpractice;

public class Methods {

	public static void main(String[] args) {
		
		NewMethod(); // we can execute this code n no.of times
		Sum(16, 8);
	}
	
	static void NewMethod()
	{
		int a= 10;
		int b =28;
		int sum = a+b;
		System.out.println(sum);
	}

	static int Sum(int a, int b)
	{
		int sum=0;
		sum = a+b;
		return sum;
}

	
}
