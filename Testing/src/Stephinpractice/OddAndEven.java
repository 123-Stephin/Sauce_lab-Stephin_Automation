package Stephinpractice;

public class OddAndEven {

	public static void main(String[] args) {

		int[] arr1 = {45,10,12,90,5};
		for(int i=0; i<arr1.length;i++)
		{
			if(arr1[i] % 2==0)
			{
				System.out.println(arr1[i]+" even");
			}
			else
			{
				System.out.println(arr1[i]+" odd");
			}
		}
	}

}
