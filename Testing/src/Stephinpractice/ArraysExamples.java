package Stephinpractice;

public class ArraysExamples {


	public static void main(String[] args) {
		//<datatype>[] <arrayname> = new <datatype>[size];
		int[] arr= new int[5];
		arr[0]=13;
		arr[1]=22;
		arr[2]=10;
		arr[3]=3;
		arr[4]=55;
		
		for(int i=0;i<arr.length;i++)
		{
			System.out.println(arr[i]);
		}
	}

}
