package Stephinpractice;

public class Calculator {
	
	public void add()
	{
		System.out.println(10+2);
	}
	public void add(float a, float b)
	{
		float d= a+b;
		System.out.println(d);
	}
	public void add(float a, float b, float w)
	{
		float s= a+b+w;
		System.out.println(s);
	}
	public void add(float a, int b)
	{
		float j= a+b;
		System.out.println(j);
	}
	
	public void mul(int a, float b)
	{
		float e = a*b;
		System.out.println(e);
	}
	
	public void div(int a, int b)
	{
		int f= a/b;
		System.out.println(f);
	}

	public static void main(String[] args) {

		Calculator c = new Calculator();
		c.add(18.7f,15.1f);
		c.add(10.2f,49.f,55.9f);
		c.add(15.3f,66);
		c.mul(15,4.1f);
		c.div(40,5);
	}

}
