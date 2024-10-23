package arrays.java.zn;

import java.util.Arrays;

public class Arrays08 {

	public static void main(String[] args) {
		int arr[]= {1,2,3,4};
		int arr1[]=new int[arr.length];
		
		for(int i=0; i<arr.length; i++)
		{
			arr1[i]=arr[i];
		}
		
		System.out.println("New Array is : "+Arrays.toString(arr1));
	}

}
