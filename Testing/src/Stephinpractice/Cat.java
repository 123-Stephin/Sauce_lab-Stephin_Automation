package Stephinpractice;

public class Cat extends Animal{
//Cat is child Animal is the parent b'cos Cat gets prop of Animal
	
	public static void main(String[] args) {

		Cat c = new Cat();
		c.makeSound();

	}

	public void makeSound()
	{
		System.out.println("Mweeeo");
	}
}
