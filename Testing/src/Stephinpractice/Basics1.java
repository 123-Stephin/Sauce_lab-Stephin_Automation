package Stephinpractice;

public class Basics1 {

	public static void main(String[] args) {
		int a = 10;
		int b = 28;
		int sum = a+b;
		
		String s = "Hi all My name is Stephin";
		System.out.println(s + "\nand my number is " + sum);
		
		
		int arr[] = new int[5];
		arr[0] = 1;
		arr[1] = 4;
		arr[2] = 28;
		System.out.println(arr[1]);
		
		int arr1[] = {1,4,7,5,0};
		
		for(int i=0; i<arr1.length;i++)
		{
			System.out.println(arr1[i]);
		}
		
		String[] name = {"stephin","amal","adon","rahul"};
		//System.out.println(name[3]);
		
		for(int i=0; i<name.length;i++)
		{
			System.out.println(name[i]);
		}

		//Enhanced for loop over array
		
		for(String n :name)
		{
			System.out.println("\n"+n);
		}
	}

}
